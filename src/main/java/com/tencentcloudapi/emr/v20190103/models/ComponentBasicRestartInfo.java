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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentBasicRestartInfo extends AbstractModel{

    /**
    * 进程名，必填，如NameNode
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * 操作的IP列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * Get 进程名，必填，如NameNode
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentName 进程名，必填，如NameNode
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 进程名，必填，如NameNode
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentName 进程名，必填，如NameNode
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get 操作的IP列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpList 操作的IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set 操作的IP列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpList 操作的IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    public ComponentBasicRestartInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentBasicRestartInfo(ComponentBasicRestartInfo source) {
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

