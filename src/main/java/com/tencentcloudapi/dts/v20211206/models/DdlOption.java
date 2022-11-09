/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DdlOption extends AbstractModel{

    /**
    * ddl类型，如Database,Table,View,Index等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdlObject")
    @Expose
    private String DdlObject;

    /**
    * ddl具体值，对于Database可取值[Create,Drop,Alter]<br>对于Table可取值[Create,Drop,Alter,Truncate,Rename]<br/>对于View可取值[Create,Drop]<br/>对于Index可取值[Create,Drop]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdlValue")
    @Expose
    private String [] DdlValue;

    /**
     * Get ddl类型，如Database,Table,View,Index等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdlObject ddl类型，如Database,Table,View,Index等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDdlObject() {
        return this.DdlObject;
    }

    /**
     * Set ddl类型，如Database,Table,View,Index等
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdlObject ddl类型，如Database,Table,View,Index等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdlObject(String DdlObject) {
        this.DdlObject = DdlObject;
    }

    /**
     * Get ddl具体值，对于Database可取值[Create,Drop,Alter]<br>对于Table可取值[Create,Drop,Alter,Truncate,Rename]<br/>对于View可取值[Create,Drop]<br/>对于Index可取值[Create,Drop]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdlValue ddl具体值，对于Database可取值[Create,Drop,Alter]<br>对于Table可取值[Create,Drop,Alter,Truncate,Rename]<br/>对于View可取值[Create,Drop]<br/>对于Index可取值[Create,Drop]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDdlValue() {
        return this.DdlValue;
    }

    /**
     * Set ddl具体值，对于Database可取值[Create,Drop,Alter]<br>对于Table可取值[Create,Drop,Alter,Truncate,Rename]<br/>对于View可取值[Create,Drop]<br/>对于Index可取值[Create,Drop]
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdlValue ddl具体值，对于Database可取值[Create,Drop,Alter]<br>对于Table可取值[Create,Drop,Alter,Truncate,Rename]<br/>对于View可取值[Create,Drop]<br/>对于Index可取值[Create,Drop]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdlValue(String [] DdlValue) {
        this.DdlValue = DdlValue;
    }

    public DdlOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DdlOption(DdlOption source) {
        if (source.DdlObject != null) {
            this.DdlObject = new String(source.DdlObject);
        }
        if (source.DdlValue != null) {
            this.DdlValue = new String[source.DdlValue.length];
            for (int i = 0; i < source.DdlValue.length; i++) {
                this.DdlValue[i] = new String(source.DdlValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DdlObject", this.DdlObject);
        this.setParamArraySimple(map, prefix + "DdlValue.", this.DdlValue);

    }
}

