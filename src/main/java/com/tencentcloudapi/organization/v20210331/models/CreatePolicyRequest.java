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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePolicyRequest extends AbstractModel {

    /**
    * 策略名。
长度为1~128个字符，可以包含汉字、英文字母、数字和下划线（_）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 策略内容。参考CAM策略语法
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 策略描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 策略名。
长度为1~128个字符，可以包含汉字、英文字母、数字和下划线（_） 
     * @return Name 策略名。
长度为1~128个字符，可以包含汉字、英文字母、数字和下划线（_）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名。
长度为1~128个字符，可以包含汉字、英文字母、数字和下划线（_）
     * @param Name 策略名。
长度为1~128个字符，可以包含汉字、英文字母、数字和下划线（_）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 策略内容。参考CAM策略语法 
     * @return Content 策略内容。参考CAM策略语法
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 策略内容。参考CAM策略语法
     * @param Content 策略内容。参考CAM策略语法
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略 
     * @return Type 策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略
     * @param Type 策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 策略描述。 
     * @return Description 策略描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述。
     * @param Description 策略描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreatePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePolicyRequest(CreatePolicyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

