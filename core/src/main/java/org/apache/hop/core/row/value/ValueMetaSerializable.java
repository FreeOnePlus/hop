/*! ******************************************************************************
 *
 * Hop : The Hop Orchestration Platform
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
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

package org.apache.hop.core.row.value;

import org.apache.hop.core.row.IValueMeta;

@ValueMetaPlugin(
  id = "7",
  name = "Serializable",
  description = "Serializable",
  image = "images/binary.svg"
)
public class ValueMetaSerializable extends ValueMetaBase implements IValueMeta {

  public ValueMetaSerializable() {
    this( null );
  }

  public ValueMetaSerializable( String name ) {
    super( name, IValueMeta.TYPE_SERIALIZABLE );
  }

}
