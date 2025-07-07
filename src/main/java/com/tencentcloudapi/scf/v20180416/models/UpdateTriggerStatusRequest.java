/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateTriggerStatusRequest extends AbstractModel {

    /**
    * 触发器的初始是能状态OPEN表示开启 CLOSE表示关闭
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 触发器名称
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * 触发器类型，触发器类型，目前只支持 timer、 cos  、 ckafka三种类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 触发器在创建时所指向的触发别名或版本，默认值为$LATEST
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 函数所在的命名空间，默认值为default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 如果更新的触发器类型为 COS 触发器，该字段为必填值，存放 JSON 格式的数据 {"event":"cos:ObjectCreated:*"}，数据内容和 SetTrigger 接口中该字段的格式相同；如果更新的触发器类型为定时触发器或 CMQ 触发器，可以不指定该字段
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
     * Get 触发器的初始是能状态OPEN表示开启 CLOSE表示关闭 
     * @return Enable 触发器的初始是能状态OPEN表示开启 CLOSE表示关闭
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set 触发器的初始是能状态OPEN表示开启 CLOSE表示关闭
     * @param Enable 触发器的初始是能状态OPEN表示开启 CLOSE表示关闭
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 函数名称 
     * @return FunctionName 函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名称
     * @param FunctionName 函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 触发器名称 
     * @return TriggerName 触发器名称
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set 触发器名称
     * @param TriggerName 触发器名称
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get 触发器类型，触发器类型，目前只支持 timer、 cos  、 ckafka三种类型 
     * @return Type 触发器类型，触发器类型，目前只支持 timer、 cos  、 ckafka三种类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 触发器类型，触发器类型，目前只支持 timer、 cos  、 ckafka三种类型
     * @param Type 触发器类型，触发器类型，目前只支持 timer、 cos  、 ckafka三种类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 触发器在创建时所指向的触发别名或版本，默认值为$LATEST 
     * @return Qualifier 触发器在创建时所指向的触发别名或版本，默认值为$LATEST
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 触发器在创建时所指向的触发别名或版本，默认值为$LATEST
     * @param Qualifier 触发器在创建时所指向的触发别名或版本，默认值为$LATEST
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 函数所在的命名空间，默认值为default 
     * @return Namespace 函数所在的命名空间，默认值为default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数所在的命名空间，默认值为default
     * @param Namespace 函数所在的命名空间，默认值为default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 如果更新的触发器类型为 COS 触发器，该字段为必填值，存放 JSON 格式的数据 {"event":"cos:ObjectCreated:*"}，数据内容和 SetTrigger 接口中该字段的格式相同；如果更新的触发器类型为定时触发器或 CMQ 触发器，可以不指定该字段 
     * @return TriggerDesc 如果更新的触发器类型为 COS 触发器，该字段为必填值，存放 JSON 格式的数据 {"event":"cos:ObjectCreated:*"}，数据内容和 SetTrigger 接口中该字段的格式相同；如果更新的触发器类型为定时触发器或 CMQ 触发器，可以不指定该字段
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * Set 如果更新的触发器类型为 COS 触发器，该字段为必填值，存放 JSON 格式的数据 {"event":"cos:ObjectCreated:*"}，数据内容和 SetTrigger 接口中该字段的格式相同；如果更新的触发器类型为定时触发器或 CMQ 触发器，可以不指定该字段
     * @param TriggerDesc 如果更新的触发器类型为 COS 触发器，该字段为必填值，存放 JSON 格式的数据 {"event":"cos:ObjectCreated:*"}，数据内容和 SetTrigger 接口中该字段的格式相同；如果更新的触发器类型为定时触发器或 CMQ 触发器，可以不指定该字段
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    public UpdateTriggerStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTriggerStatusRequest(UpdateTriggerStatusRequest source) {
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.TriggerDesc != null) {
            this.TriggerDesc = new String(source.TriggerDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "TriggerDesc", this.TriggerDesc);

    }
}

