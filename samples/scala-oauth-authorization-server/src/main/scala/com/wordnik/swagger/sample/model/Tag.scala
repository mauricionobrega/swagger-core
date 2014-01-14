/**
 *  Copyright 2012 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wordnik.swagger.sample.model

import com.wordnik.swagger.annotations._

import javax.xml.bind.annotation._

@XmlRootElement(name = "Tag")
class Tag {
  private var id:Long = 0
  private var name:String = _

  @ApiModelProperty(position = 1)
  @XmlElement(name="id")
  def getId():Long = id
  def setId(id:Long):Unit = this.id = id

  @ApiModelProperty(position = 2)
  @XmlRootElement(name = "name")
  def getName():String = name
  def setName(name:String):Unit = this.name = name

  override def toString() = {
    val sb = new StringBuilder
    sb.append("Tag(")
      .append("id=").append(id).append(", ")
      .append("name=").append(name)
      .append(")")

    sb.toString
  }
}