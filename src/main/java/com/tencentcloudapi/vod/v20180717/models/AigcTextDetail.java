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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcTextDetail extends AbstractModel {

    /**
    * <p>每页条数</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>上一页响应中返回的 scroll_token,用于翻下一页</p>
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * <p>生文详细数据</p>
    */
    @SerializedName("Data")
    @Expose
    private AigcTextDetailData [] Data;

    /**
     * Get <p>每页条数</p> 
     * @return PageSize <p>每页条数</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页条数</p>
     * @param PageSize <p>每页条数</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>上一页响应中返回的 scroll_token,用于翻下一页</p> 
     * @return ScrollToken <p>上一页响应中返回的 scroll_token,用于翻下一页</p>
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set <p>上一页响应中返回的 scroll_token,用于翻下一页</p>
     * @param ScrollToken <p>上一页响应中返回的 scroll_token,用于翻下一页</p>
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get <p>生文详细数据</p> 
     * @return Data <p>生文详细数据</p>
     */
    public AigcTextDetailData [] getData() {
        return this.Data;
    }

    /**
     * Set <p>生文详细数据</p>
     * @param Data <p>生文详细数据</p>
     */
    public void setData(AigcTextDetailData [] Data) {
        this.Data = Data;
    }

    public AigcTextDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcTextDetail(AigcTextDetail source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
        if (source.Data != null) {
            this.Data = new AigcTextDetailData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new AigcTextDetailData(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

