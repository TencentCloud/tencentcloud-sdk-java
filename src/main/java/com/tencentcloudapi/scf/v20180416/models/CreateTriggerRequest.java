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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTriggerRequest extends AbstractModel{

    /**
    * 新建触发器绑定的函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 新建触发器名称。如果是定时触发器，名称支持英文字母、数字、连接符和下划线，最长100个字符；如果是cos触发器，需要是对应cos存储桶适用于XML API的访问域名(例如:5401-5ff414-12345.cos.ap-shanghai.myqcloud.com);如果是其他触发器，见具体触发器绑定参数的说明
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * 触发器类型，目前支持 cos 、cmq、 timer、 ckafka、apigw类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 触发器对应的参数，可见具体[触发器描述说明](https://cloud.tencent.com/document/product/583/39901)
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
    * 函数的命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数的版本
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 触发器的初始是能状态 OPEN表示开启 CLOSE表示关闭
    */
    @SerializedName("Enable")
    @Expose
    private String Enable;

    /**
    * 用户自定义参数，仅支持timer触发器
    */
    @SerializedName("CustomArgument")
    @Expose
    private String CustomArgument;

    /**
     * Get 新建触发器绑定的函数名称 
     * @return FunctionName 新建触发器绑定的函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 新建触发器绑定的函数名称
     * @param FunctionName 新建触发器绑定的函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 新建触发器名称。如果是定时触发器，名称支持英文字母、数字、连接符和下划线，最长100个字符；如果是cos触发器，需要是对应cos存储桶适用于XML API的访问域名(例如:5401-5ff414-12345.cos.ap-shanghai.myqcloud.com);如果是其他触发器，见具体触发器绑定参数的说明 
     * @return TriggerName 新建触发器名称。如果是定时触发器，名称支持英文字母、数字、连接符和下划线，最长100个字符；如果是cos触发器，需要是对应cos存储桶适用于XML API的访问域名(例如:5401-5ff414-12345.cos.ap-shanghai.myqcloud.com);如果是其他触发器，见具体触发器绑定参数的说明
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set 新建触发器名称。如果是定时触发器，名称支持英文字母、数字、连接符和下划线，最长100个字符；如果是cos触发器，需要是对应cos存储桶适用于XML API的访问域名(例如:5401-5ff414-12345.cos.ap-shanghai.myqcloud.com);如果是其他触发器，见具体触发器绑定参数的说明
     * @param TriggerName 新建触发器名称。如果是定时触发器，名称支持英文字母、数字、连接符和下划线，最长100个字符；如果是cos触发器，需要是对应cos存储桶适用于XML API的访问域名(例如:5401-5ff414-12345.cos.ap-shanghai.myqcloud.com);如果是其他触发器，见具体触发器绑定参数的说明
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get 触发器类型，目前支持 cos 、cmq、 timer、 ckafka、apigw类型 
     * @return Type 触发器类型，目前支持 cos 、cmq、 timer、 ckafka、apigw类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 触发器类型，目前支持 cos 、cmq、 timer、 ckafka、apigw类型
     * @param Type 触发器类型，目前支持 cos 、cmq、 timer、 ckafka、apigw类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 触发器对应的参数，可见具体[触发器描述说明](https://cloud.tencent.com/document/product/583/39901) 
     * @return TriggerDesc 触发器对应的参数，可见具体[触发器描述说明](https://cloud.tencent.com/document/product/583/39901)
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * Set 触发器对应的参数，可见具体[触发器描述说明](https://cloud.tencent.com/document/product/583/39901)
     * @param TriggerDesc 触发器对应的参数，可见具体[触发器描述说明](https://cloud.tencent.com/document/product/583/39901)
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    /**
     * Get 函数的命名空间 
     * @return Namespace 函数的命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数的命名空间
     * @param Namespace 函数的命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 函数的版本 
     * @return Qualifier 函数的版本
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 函数的版本
     * @param Qualifier 函数的版本
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 触发器的初始是能状态 OPEN表示开启 CLOSE表示关闭 
     * @return Enable 触发器的初始是能状态 OPEN表示开启 CLOSE表示关闭
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * Set 触发器的初始是能状态 OPEN表示开启 CLOSE表示关闭
     * @param Enable 触发器的初始是能状态 OPEN表示开启 CLOSE表示关闭
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 用户自定义参数，仅支持timer触发器 
     * @return CustomArgument 用户自定义参数，仅支持timer触发器
     */
    public String getCustomArgument() {
        return this.CustomArgument;
    }

    /**
     * Set 用户自定义参数，仅支持timer触发器
     * @param CustomArgument 用户自定义参数，仅支持timer触发器
     */
    public void setCustomArgument(String CustomArgument) {
        this.CustomArgument = CustomArgument;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TriggerDesc", this.TriggerDesc);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "CustomArgument", this.CustomArgument);

    }
}

