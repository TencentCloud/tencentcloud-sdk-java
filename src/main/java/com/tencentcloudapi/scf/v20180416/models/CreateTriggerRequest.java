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

public class CreateTriggerRequest  extends AbstractModel{

    /**
    * 新建触发器绑定的函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 新建触发器名称。如果是定时触发器，名称支持英文字母、数字、连接符和下划线，最长100个字符；如果是其他触发器，见具体触发器绑定参数的说明
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * 触发器类型，目前支持 cos 、cmq、 timer、 ckafka类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 触发器对应的参数，如果是 timer 类型的触发器其内容是 Linux cron 表达式，如果是其他触发器，见具体触发器说明
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
     * 获取新建触发器绑定的函数名称
     * @return FunctionName 新建触发器绑定的函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * 设置新建触发器绑定的函数名称
     * @param FunctionName 新建触发器绑定的函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * 获取新建触发器名称。如果是定时触发器，名称支持英文字母、数字、连接符和下划线，最长100个字符；如果是其他触发器，见具体触发器绑定参数的说明
     * @return TriggerName 新建触发器名称。如果是定时触发器，名称支持英文字母、数字、连接符和下划线，最长100个字符；如果是其他触发器，见具体触发器绑定参数的说明
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * 设置新建触发器名称。如果是定时触发器，名称支持英文字母、数字、连接符和下划线，最长100个字符；如果是其他触发器，见具体触发器绑定参数的说明
     * @param TriggerName 新建触发器名称。如果是定时触发器，名称支持英文字母、数字、连接符和下划线，最长100个字符；如果是其他触发器，见具体触发器绑定参数的说明
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * 获取触发器类型，目前支持 cos 、cmq、 timer、 ckafka类型
     * @return Type 触发器类型，目前支持 cos 、cmq、 timer、 ckafka类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置触发器类型，目前支持 cos 、cmq、 timer、 ckafka类型
     * @param Type 触发器类型，目前支持 cos 、cmq、 timer、 ckafka类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取触发器对应的参数，如果是 timer 类型的触发器其内容是 Linux cron 表达式，如果是其他触发器，见具体触发器说明
     * @return TriggerDesc 触发器对应的参数，如果是 timer 类型的触发器其内容是 Linux cron 表达式，如果是其他触发器，见具体触发器说明
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * 设置触发器对应的参数，如果是 timer 类型的触发器其内容是 Linux cron 表达式，如果是其他触发器，见具体触发器说明
     * @param TriggerDesc 触发器对应的参数，如果是 timer 类型的触发器其内容是 Linux cron 表达式，如果是其他触发器，见具体触发器说明
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    /**
     * 获取函数的命名空间
     * @return Namespace 函数的命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * 设置函数的命名空间
     * @param Namespace 函数的命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * 获取函数的版本
     * @return Qualifier 函数的版本
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * 设置函数的版本
     * @param Qualifier 函数的版本
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * 获取触发器的初始是能状态 OPEN表示开启 CLOSE表示关闭
     * @return Enable 触发器的初始是能状态 OPEN表示开启 CLOSE表示关闭
     */
    public String getEnable() {
        return this.Enable;
    }

    /**
     * 设置触发器的初始是能状态 OPEN表示开启 CLOSE表示关闭
     * @param Enable 触发器的初始是能状态 OPEN表示开启 CLOSE表示关闭
     */
    public void setEnable(String Enable) {
        this.Enable = Enable;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TriggerDesc", this.TriggerDesc);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

