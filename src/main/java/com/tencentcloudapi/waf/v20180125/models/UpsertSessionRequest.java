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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpsertSessionRequest extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * session来源位置
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 提取类别
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 提取key或者起始匹配模式
    */
    @SerializedName("KeyOrStartMat")
    @Expose
    private String KeyOrStartMat;

    /**
    * 结束匹配模式
    */
    @SerializedName("EndMat")
    @Expose
    private String EndMat;

    /**
    * 起始偏移位置
    */
    @SerializedName("StartOffset")
    @Expose
    private String StartOffset;

    /**
    * 结束偏移位置
    */
    @SerializedName("EndOffset")
    @Expose
    private String EndOffset;

    /**
    * 版本
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get session来源位置 
     * @return Source session来源位置
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set session来源位置
     * @param Source session来源位置
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 提取类别 
     * @return Category 提取类别
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 提取类别
     * @param Category 提取类别
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 提取key或者起始匹配模式 
     * @return KeyOrStartMat 提取key或者起始匹配模式
     */
    public String getKeyOrStartMat() {
        return this.KeyOrStartMat;
    }

    /**
     * Set 提取key或者起始匹配模式
     * @param KeyOrStartMat 提取key或者起始匹配模式
     */
    public void setKeyOrStartMat(String KeyOrStartMat) {
        this.KeyOrStartMat = KeyOrStartMat;
    }

    /**
     * Get 结束匹配模式 
     * @return EndMat 结束匹配模式
     */
    public String getEndMat() {
        return this.EndMat;
    }

    /**
     * Set 结束匹配模式
     * @param EndMat 结束匹配模式
     */
    public void setEndMat(String EndMat) {
        this.EndMat = EndMat;
    }

    /**
     * Get 起始偏移位置 
     * @return StartOffset 起始偏移位置
     */
    public String getStartOffset() {
        return this.StartOffset;
    }

    /**
     * Set 起始偏移位置
     * @param StartOffset 起始偏移位置
     */
    public void setStartOffset(String StartOffset) {
        this.StartOffset = StartOffset;
    }

    /**
     * Get 结束偏移位置 
     * @return EndOffset 结束偏移位置
     */
    public String getEndOffset() {
        return this.EndOffset;
    }

    /**
     * Set 结束偏移位置
     * @param EndOffset 结束偏移位置
     */
    public void setEndOffset(String EndOffset) {
        this.EndOffset = EndOffset;
    }

    /**
     * Get 版本 
     * @return Edition 版本
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 版本
     * @param Edition 版本
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    public UpsertSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpsertSessionRequest(UpsertSessionRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.KeyOrStartMat != null) {
            this.KeyOrStartMat = new String(source.KeyOrStartMat);
        }
        if (source.EndMat != null) {
            this.EndMat = new String(source.EndMat);
        }
        if (source.StartOffset != null) {
            this.StartOffset = new String(source.StartOffset);
        }
        if (source.EndOffset != null) {
            this.EndOffset = new String(source.EndOffset);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "KeyOrStartMat", this.KeyOrStartMat);
        this.setParamSimple(map, prefix + "EndMat", this.EndMat);
        this.setParamSimple(map, prefix + "StartOffset", this.StartOffset);
        this.setParamSimple(map, prefix + "EndOffset", this.EndOffset);
        this.setParamSimple(map, prefix + "Edition", this.Edition);

    }
}

