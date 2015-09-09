/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2015 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.core.vfs.configuration;

import org.apache.commons.vfs2.FileSystemOptions;
import org.apache.commons.vfs2.provider.sftp.SftpFileSystemConfigBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class KettleSftpFileSystemConfigBuilderTest {
  @Test
  public void setUserDirIsRootTest() throws IOException {
    KettleSftpFileSystemConfigBuilder builder = new KettleSftpFileSystemConfigBuilder();
    final FileSystemOptions opts = new FileSystemOptions();

    builder.setParameter( opts, "UserDirIsRoot", "true", "vfs.sftp.UserDirIsRoot", "sftp://testurl" );
    Assert.assertTrue( SftpFileSystemConfigBuilder.getInstance().getUserDirIsRoot( opts ) );

    builder.setParameter( opts, "UserDirIsRoot", "false", "vfs.sftp.UserDirIsRoot", "sftp://testurl" );
    Assert.assertFalse( SftpFileSystemConfigBuilder.getInstance().getUserDirIsRoot( opts ) );
  }
}
