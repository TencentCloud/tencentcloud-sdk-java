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
    * 搜索词
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 返回结果类型，0-自然检索结果(默认)，1-多模态VR结果，2-混合结果（多模态VR结果+自然检索结果）
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 指定域名站内搜索（用于过滤自然检索结果）
注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效
    */
    @SerializedName("Site")
    @Expose
    private String Site;

    /**
    * 起始时间（用于过滤自然检索结果），精确到秒时间戳格式
注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效
    */
    @SerializedName("FromTime")
    @Expose
    private Long FromTime;

    /**
    * 结束时间（用于过滤自然检索结果），精确到秒时间戳格式
注意：mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效
    */
    @SerializedName("ToTime")
    @Expose
    private Long ToTime;

    /**
    * cnt=10/20/30/40/50，最多可支持返回50条搜索结果，**仅限尊享版使用**
    */
    @SerializedName("Cnt")
    @Expose
    private Long Cnt;

    /**
    * Industry=gov/news/acad，对应党政机关、新闻、学术，**仅限尊享版使用**
    */
    @SerializedName("Industry")
    @Expose
    private String Industry;

    /**
     * Get 搜索词 
     * @return Query 搜索词
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 搜索词
     * @param Query 搜索词
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 返回结果类型，0-自然检索结果(默认)，1-多模态VR结果，2-混合结果（多模态VR结果+自然检索结果） 
     * @return Mode 返回结果类型，0-自然检索结果(默认)，1-多模态VR结果，2-混合结果（多模态VR结果+自然检索结果）
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 返回结果类型，0-自然检索结果(默认)，1-多模态VR结果，2-混合结果（多模态VR结果+自然检索结果）
     * @param Mode 返回结果类型，0-自然检索结果(默认)，1-多模态VR结果，2-混合结果（多模态VR结果+自然检索结果）
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 指定域名站内搜索（用于过滤自然检索结果）
注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效 
     * @return Site 指定域名站内搜索（用于过滤自然检索结果）
注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效
     */
    public String getSite() {
        return this.Site;
    }

    /**
     * Set 指定域名站内搜索（用于过滤自然检索结果）
注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效
     * @param Site 指定域名站内搜索（用于过滤自然检索结果）
注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效
     */
    public void setSite(String Site) {
        this.Site = Site;
    }

    /**
     * Get 起始时间（用于过滤自然检索结果），精确到秒时间戳格式
注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效 
     * @return FromTime 起始时间（用于过滤自然检索结果），精确到秒时间戳格式
注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效
     */
    public Long getFromTime() {
        return this.FromTime;
    }

    /**
     * Set 起始时间（用于过滤自然检索结果），精确到秒时间戳格式
注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效
     * @param FromTime 起始时间（用于过滤自然检索结果），精确到秒时间戳格式
注意： mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效
     */
    public void setFromTime(Long FromTime) {
        this.FromTime = FromTime;
    }

    /**
     * Get 结束时间（用于过滤自然检索结果），精确到秒时间戳格式
注意：mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效 
     * @return ToTime 结束时间（用于过滤自然检索结果），精确到秒时间戳格式
注意：mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效
     */
    public Long getToTime() {
        return this.ToTime;
    }

    /**
     * Set 结束时间（用于过滤自然检索结果），精确到秒时间戳格式
注意：mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效
     * @param ToTime 结束时间（用于过滤自然检索结果），精确到秒时间戳格式
注意：mode=1模式下，参数无效；mode=0模式下，对所有结果生效；mode=2模式下，对输出的自然结果生效
     */
    public void setToTime(Long ToTime) {
        this.ToTime = ToTime;
    }

    /**
     * Get cnt=10/20/30/40/50，最多可支持返回50条搜索结果，**仅限尊享版使用** 
     * @return Cnt cnt=10/20/30/40/50，最多可支持返回50条搜索结果，**仅限尊享版使用**
     */
    public Long getCnt() {
        return this.Cnt;
    }

    /**
     * Set cnt=10/20/30/40/50，最多可支持返回50条搜索结果，**仅限尊享版使用**
     * @param Cnt cnt=10/20/30/40/50，最多可支持返回50条搜索结果，**仅限尊享版使用**
     */
    public void setCnt(Long Cnt) {
        this.Cnt = Cnt;
    }

    /**
     * Get Industry=gov/news/acad，对应党政机关、新闻、学术，**仅限尊享版使用** 
     * @return Industry Industry=gov/news/acad，对应党政机关、新闻、学术，**仅限尊享版使用**
     */
    public String getIndustry() {
        return this.Industry;
    }

    /**
     * Set Industry=gov/news/acad，对应党政机关、新闻、学术，**仅限尊享版使用**
     * @param Industry Industry=gov/news/acad，对应党政机关、新闻、学术，**仅限尊享版使用**
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

