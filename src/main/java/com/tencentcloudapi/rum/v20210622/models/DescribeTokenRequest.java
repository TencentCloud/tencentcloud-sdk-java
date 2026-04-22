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
    * <p>筛选条件</p>
    */
    @SerializedName("FormListString")
    @Expose
    private String FormListString;

    /**
    * <p>仅对比模式下填写，筛选条件A</p>
    */
    @SerializedName("FormListAString")
    @Expose
    private String FormListAString;

    /**
    * <p>仅对比模式下填写，筛选条件B</p>
    */
    @SerializedName("FormListBString")
    @Expose
    private String FormListBString;

    /**
    * <p>请求头</p>
    */
    @SerializedName("RequestHeader")
    @Expose
    private String RequestHeader;

    /**
    * <p>拓展字段</p>
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
     * Get <p>筛选条件</p> 
     * @return FormListString <p>筛选条件</p>
     */
    public String getFormListString() {
        return this.FormListString;
    }

    /**
     * Set <p>筛选条件</p>
     * @param FormListString <p>筛选条件</p>
     */
    public void setFormListString(String FormListString) {
        this.FormListString = FormListString;
    }

    /**
     * Get <p>仅对比模式下填写，筛选条件A</p> 
     * @return FormListAString <p>仅对比模式下填写，筛选条件A</p>
     */
    public String getFormListAString() {
        return this.FormListAString;
    }

    /**
     * Set <p>仅对比模式下填写，筛选条件A</p>
     * @param FormListAString <p>仅对比模式下填写，筛选条件A</p>
     */
    public void setFormListAString(String FormListAString) {
        this.FormListAString = FormListAString;
    }

    /**
     * Get <p>仅对比模式下填写，筛选条件B</p> 
     * @return FormListBString <p>仅对比模式下填写，筛选条件B</p>
     */
    public String getFormListBString() {
        return this.FormListBString;
    }

    /**
     * Set <p>仅对比模式下填写，筛选条件B</p>
     * @param FormListBString <p>仅对比模式下填写，筛选条件B</p>
     */
    public void setFormListBString(String FormListBString) {
        this.FormListBString = FormListBString;
    }

    /**
     * Get <p>请求头</p> 
     * @return RequestHeader <p>请求头</p>
     */
    public String getRequestHeader() {
        return this.RequestHeader;
    }

    /**
     * Set <p>请求头</p>
     * @param RequestHeader <p>请求头</p>
     */
    public void setRequestHeader(String RequestHeader) {
        this.RequestHeader = RequestHeader;
    }

    /**
     * Get <p>拓展字段</p> 
     * @return ExtraData <p>拓展字段</p>
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set <p>拓展字段</p>
     * @param ExtraData <p>拓展字段</p>
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

