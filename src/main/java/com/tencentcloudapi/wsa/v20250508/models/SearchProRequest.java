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
package com.tencentcloudapi.wsa.v20250508.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchProRequest extends AbstractModel {

    /**
    * <p>搜索词</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>返回结果类型，0-自然检索结果(默认)，1-多模态VR结果，2-混合结果（多模态VR结果+自然检索结果）</p>
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * <p>指定域名站内搜索（用于过滤自然检索结果）<br>注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p>
    */
    @SerializedName("Site")
    @Expose
    private String Site;

    /**
    * <p>起始时间（用于过滤自然检索结果），精确到秒时间戳格式<br>注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p>
    */
    @SerializedName("FromTime")
    @Expose
    private Long FromTime;

    /**
    * <p>结束时间（用于过滤自然检索结果），精确到秒时间戳格式<br>注意：mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p>
    */
    @SerializedName("ToTime")
    @Expose
    private Long ToTime;

    /**
    * <p>cnt=10/20/30/40/50，最多可支持返回50条搜索结果，<strong>仅限尊享版使用</strong></p>
    */
    @SerializedName("Cnt")
    @Expose
    private Long Cnt;

    /**
    * <p>Industry=gov/news/acad/finance，对应党政机关、权威媒体、学术（英文）、金融，<strong>仅限尊享版使用</strong></p>
    */
    @SerializedName("Industry")
    @Expose
    private String Industry;

    /**
     * Get <p>搜索词</p> 
     * @return Query <p>搜索词</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>搜索词</p>
     * @param Query <p>搜索词</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>返回结果类型，0-自然检索结果(默认)，1-多模态VR结果，2-混合结果（多模态VR结果+自然检索结果）</p> 
     * @return Mode <p>返回结果类型，0-自然检索结果(默认)，1-多模态VR结果，2-混合结果（多模态VR结果+自然检索结果）</p>
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set <p>返回结果类型，0-自然检索结果(默认)，1-多模态VR结果，2-混合结果（多模态VR结果+自然检索结果）</p>
     * @param Mode <p>返回结果类型，0-自然检索结果(默认)，1-多模态VR结果，2-混合结果（多模态VR结果+自然检索结果）</p>
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>指定域名站内搜索（用于过滤自然检索结果）<br>注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p> 
     * @return Site <p>指定域名站内搜索（用于过滤自然检索结果）<br>注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p>
     */
    public String getSite() {
        return this.Site;
    }

    /**
     * Set <p>指定域名站内搜索（用于过滤自然检索结果）<br>注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p>
     * @param Site <p>指定域名站内搜索（用于过滤自然检索结果）<br>注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p>
     */
    public void setSite(String Site) {
        this.Site = Site;
    }

    /**
     * Get <p>起始时间（用于过滤自然检索结果），精确到秒时间戳格式<br>注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p> 
     * @return FromTime <p>起始时间（用于过滤自然检索结果），精确到秒时间戳格式<br>注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p>
     */
    public Long getFromTime() {
        return this.FromTime;
    }

    /**
     * Set <p>起始时间（用于过滤自然检索结果），精确到秒时间戳格式<br>注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p>
     * @param FromTime <p>起始时间（用于过滤自然检索结果），精确到秒时间戳格式<br>注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p>
     */
    public void setFromTime(Long FromTime) {
        this.FromTime = FromTime;
    }

    /**
     * Get <p>结束时间（用于过滤自然检索结果），精确到秒时间戳格式<br>注意：mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p> 
     * @return ToTime <p>结束时间（用于过滤自然检索结果），精确到秒时间戳格式<br>注意：mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p>
     */
    public Long getToTime() {
        return this.ToTime;
    }

    /**
     * Set <p>结束时间（用于过滤自然检索结果），精确到秒时间戳格式<br>注意：mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p>
     * @param ToTime <p>结束时间（用于过滤自然检索结果），精确到秒时间戳格式<br>注意：mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效</p>
     */
    public void setToTime(Long ToTime) {
        this.ToTime = ToTime;
    }

    /**
     * Get <p>cnt=10/20/30/40/50，最多可支持返回50条搜索结果，<strong>仅限尊享版使用</strong></p> 
     * @return Cnt <p>cnt=10/20/30/40/50，最多可支持返回50条搜索结果，<strong>仅限尊享版使用</strong></p>
     */
    public Long getCnt() {
        return this.Cnt;
    }

    /**
     * Set <p>cnt=10/20/30/40/50，最多可支持返回50条搜索结果，<strong>仅限尊享版使用</strong></p>
     * @param Cnt <p>cnt=10/20/30/40/50，最多可支持返回50条搜索结果，<strong>仅限尊享版使用</strong></p>
     */
    public void setCnt(Long Cnt) {
        this.Cnt = Cnt;
    }

    /**
     * Get <p>Industry=gov/news/acad/finance，对应党政机关、权威媒体、学术（英文）、金融，<strong>仅限尊享版使用</strong></p> 
     * @return Industry <p>Industry=gov/news/acad/finance，对应党政机关、权威媒体、学术（英文）、金融，<strong>仅限尊享版使用</strong></p>
     */
    public String getIndustry() {
        return this.Industry;
    }

    /**
     * Set <p>Industry=gov/news/acad/finance，对应党政机关、权威媒体、学术（英文）、金融，<strong>仅限尊享版使用</strong></p>
     * @param Industry <p>Industry=gov/news/acad/finance，对应党政机关、权威媒体、学术（英文）、金融，<strong>仅限尊享版使用</strong></p>
     */
    public void setIndustry(String Industry) {
        this.Industry = Industry;
    }

    public SearchProRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchProRequest(SearchProRequest source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Site != null) {
            this.Site = new String(source.Site);
        }
        if (source.FromTime != null) {
            this.FromTime = new Long(source.FromTime);
        }
        if (source.ToTime != null) {
            this.ToTime = new Long(source.ToTime);
        }
        if (source.Cnt != null) {
            this.Cnt = new Long(source.Cnt);
        }
        if (source.Industry != null) {
            this.Industry = new String(source.Industry);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Site", this.Site);
        this.setParamSimple(map, prefix + "FromTime", this.FromTime);
        this.setParamSimple(map, prefix + "ToTime", this.ToTime);
        this.setParamSimple(map, prefix + "Cnt", this.Cnt);
        this.setParamSimple(map, prefix + "Industry", this.Industry);

    }
}

