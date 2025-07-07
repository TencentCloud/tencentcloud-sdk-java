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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFunctionRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 函数名称，只能包含小写字母、数字、连字符，以数字或字母开头，以数字或字母结尾，最大支持 30 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 函数内容，当前仅支持 JavaScript 代码，最大支持 5MB 大小。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 函数描述，最大支持 60 个字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 函数名称，只能包含小写字母、数字、连字符，以数字或字母开头，以数字或字母结尾，最大支持 30 个字符。 
     * @return Name 函数名称，只能包含小写字母、数字、连字符，以数字或字母开头，以数字或字母结尾，最大支持 30 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 函数名称，只能包含小写字母、数字、连字符，以数字或字母开头，以数字或字母结尾，最大支持 30 个字符。
     * @param Name 函数名称，只能包含小写字母、数字、连字符，以数字或字母开头，以数字或字母结尾，最大支持 30 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 函数内容，当前仅支持 JavaScript 代码，最大支持 5MB 大小。 
     * @return Content 函数内容，当前仅支持 JavaScript 代码，最大支持 5MB 大小。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 函数内容，当前仅支持 JavaScript 代码，最大支持 5MB 大小。
     * @param Content 函数内容，当前仅支持 JavaScript 代码，最大支持 5MB 大小。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 函数描述，最大支持 60 个字符。 
     * @return Remark 函数描述，最大支持 60 个字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 函数描述，最大支持 60 个字符。
     * @param Remark 函数描述，最大支持 60 个字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFunctionRequest(CreateFunctionRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

