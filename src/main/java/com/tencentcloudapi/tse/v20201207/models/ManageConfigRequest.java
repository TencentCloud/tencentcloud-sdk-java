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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManageConfigRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 配置中心类型（consul、zookeeper、apollo等）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 请求命名 PUT GET DELETE
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 配置的Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 配置的Value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 配置中心类型（consul、zookeeper、apollo等） 
     * @return Type 配置中心类型（consul、zookeeper、apollo等）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 配置中心类型（consul、zookeeper、apollo等）
     * @param Type 配置中心类型（consul、zookeeper、apollo等）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 请求命名 PUT GET DELETE 
     * @return Command 请求命名 PUT GET DELETE
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 请求命名 PUT GET DELETE
     * @param Command 请求命名 PUT GET DELETE
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 配置的Key 
     * @return Key 配置的Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 配置的Key
     * @param Key 配置的Key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 配置的Value 
     * @return Value 配置的Value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 配置的Value
     * @param Value 配置的Value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

