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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateTriggerRequest extends AbstractModel {

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
    * 触发器类型，目前只支持timer、ckafka、http三种类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 触发器开启或关闭，传参为OPEN为开启，CLOSE为关闭
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 触发器创建时所指向的函数版本或别名，默认为 $LATEST
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 函数的命名空间，默认值为default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * TriggerDesc参数
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
    * 触发器描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户附加信息
    */
    @SerializedName("CustomArgument")
    @Expose
    private String CustomArgument;

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
     * Get 触发器类型，目前只支持timer、ckafka、http三种类型 
     * @return Type 触发器类型，目前只支持timer、ckafka、http三种类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 触发器类型，目前只支持timer、ckafka、http三种类型
     * @param Type 触发器类型，目前只支持timer、ckafka、http三种类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 触发器开启或关闭，传参为OPEN为开启，CLOSE为关闭 
     * @return Enable 触发器开启或关闭，传参为OPEN为开启，CLOSE为关闭
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set 触发器开启或关闭，传参为OPEN为开启，CLOSE为关闭
     * @param Enable 触发器开启或关闭，传参为OPEN为开启，CLOSE为关闭
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 触发器创建时所指向的函数版本或别名，默认为 $LATEST 
     * @return Qualifier 触发器创建时所指向的函数版本或别名，默认为 $LATEST
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 触发器创建时所指向的函数版本或别名，默认为 $LATEST
     * @param Qualifier 触发器创建时所指向的函数版本或别名，默认为 $LATEST
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 函数的命名空间，默认值为default 
     * @return Namespace 函数的命名空间，默认值为default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数的命名空间，默认值为default
     * @param Namespace 函数的命名空间，默认值为default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get TriggerDesc参数 
     * @return TriggerDesc TriggerDesc参数
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * Set TriggerDesc参数
     * @param TriggerDesc TriggerDesc参数
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    /**
     * Get 触发器描述 
     * @return Description 触发器描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 触发器描述
     * @param Description 触发器描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户附加信息 
     * @return CustomArgument 用户附加信息
     */
    public String getCustomArgument() {
        return this.CustomArgument;
    }

    /**
     * Set 用户附加信息
     * @param CustomArgument 用户附加信息
     */
    public void setCustomArgument(String CustomArgument) {
        this.CustomArgument = CustomArgument;
    }

    public UpdateTriggerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTriggerRequest(UpdateTriggerRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Enable != null) {
            this.Enable = new String(source.Enable);
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
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CustomArgument != null) {
            this.CustomArgument = new String(source.CustomArgument);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "TriggerDesc", this.TriggerDesc);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CustomArgument", this.CustomArgument);

    }
}

