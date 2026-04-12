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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTokenRequest extends AbstractModel {

    /**
    * 筛选条件
    */
    @SerializedName("FormListString")
    @Expose
    private String FormListString;

    /**
    * 仅对比模式下填写，筛选条件A
    */
    @SerializedName("FormListAString")
    @Expose
    private String FormListAString;

    /**
    * 仅对比模式下填写，筛选条件B
    */
    @SerializedName("FormListBString")
    @Expose
    private String FormListBString;

    /**
    * 请求头
    */
    @SerializedName("RequestHeader")
    @Expose
    private String RequestHeader;

    /**
    * 拓展字段
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
     * Get 筛选条件 
     * @return FormListString 筛选条件
     */
    public String getFormListString() {
        return this.FormListString;
    }

    /**
     * Set 筛选条件
     * @param FormListString 筛选条件
     */
    public void setFormListString(String FormListString) {
        this.FormListString = FormListString;
    }

    /**
     * Get 仅对比模式下填写，筛选条件A 
     * @return FormListAString 仅对比模式下填写，筛选条件A
     */
    public String getFormListAString() {
        return this.FormListAString;
    }

    /**
     * Set 仅对比模式下填写，筛选条件A
     * @param FormListAString 仅对比模式下填写，筛选条件A
     */
    public void setFormListAString(String FormListAString) {
        this.FormListAString = FormListAString;
    }

    /**
     * Get 仅对比模式下填写，筛选条件B 
     * @return FormListBString 仅对比模式下填写，筛选条件B
     */
    public String getFormListBString() {
        return this.FormListBString;
    }

    /**
     * Set 仅对比模式下填写，筛选条件B
     * @param FormListBString 仅对比模式下填写，筛选条件B
     */
    public void setFormListBString(String FormListBString) {
        this.FormListBString = FormListBString;
    }

    /**
     * Get 请求头 
     * @return RequestHeader 请求头
     */
    public String getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set 请求头
     * @param RequestHeader 请求头
     */
    public void setRequestHeader(String RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get 拓展字段 
     * @return ExtraData 拓展字段
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set 拓展字段
     * @param ExtraData 拓展字段
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    public DescribeTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenRequest(DescribeTokenRequest source) {
        if (source.FormListString != null) {
            this.FormListString = new String(source.FormListString);
        }
        if (source.FormListAString != null) {
            this.FormListAString = new String(source.FormListAString);
        }
        if (source.FormListBString != null) {
            this.FormListBString = new String(source.FormListBString);
        }
        if (source.RequestHeader != null) {
            this.RequestHeader = new String(source.RequestHeader);
        }
        if (source.ExtraData != null) {
            this.ExtraData = new String(source.ExtraData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FormListString", this.FormListString);
        this.setParamSimple(map, prefix + "FormListAString", this.FormListAString);
        this.setParamSimple(map, prefix + "FormListBString", this.FormListBString);
        this.setParamSimple(map, prefix + "RequestHeader", this.RequestHeader);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);

    }
}

