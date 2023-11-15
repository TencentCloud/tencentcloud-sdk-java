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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInterfaceListRequest extends AbstractModel {

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 请求页号
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 请求页容量，默认全量返回
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 接口方式 1.http 2消息通知服务
    */
    @SerializedName("Style")
    @Expose
    private Long [] Style;

    /**
    * 接口分类0. 其他服务 1. IOT服务 2. 空间服务 3.微应用服务 4.场景服务 5.AI算法服务 6.任务算法服务 7.第三方服务 8.3DTiles服务
    */
    @SerializedName("Type")
    @Expose
    private Long [] Type;

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    /**
     * Get 请求页号 
     * @return PageNumber 请求页号
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 请求页号
     * @param PageNumber 请求页号
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 请求页容量，默认全量返回 
     * @return PageSize 请求页容量，默认全量返回
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 请求页容量，默认全量返回
     * @param PageSize 请求页容量，默认全量返回
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询关键字 
     * @return Keyword 查询关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 查询关键字
     * @param Keyword 查询关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 接口方式 1.http 2消息通知服务 
     * @return Style 接口方式 1.http 2消息通知服务
     */
    public Long [] getStyle() {
        return this.Style;
    }

    /**
     * Set 接口方式 1.http 2消息通知服务
     * @param Style 接口方式 1.http 2消息通知服务
     */
    public void setStyle(Long [] Style) {
        this.Style = Style;
    }

    /**
     * Get 接口分类0. 其他服务 1. IOT服务 2. 空间服务 3.微应用服务 4.场景服务 5.AI算法服务 6.任务算法服务 7.第三方服务 8.3DTiles服务 
     * @return Type 接口分类0. 其他服务 1. IOT服务 2. 空间服务 3.微应用服务 4.场景服务 5.AI算法服务 6.任务算法服务 7.第三方服务 8.3DTiles服务
     */
    public Long [] getType() {
        return this.Type;
    }

    /**
     * Set 接口分类0. 其他服务 1. IOT服务 2. 空间服务 3.微应用服务 4.场景服务 5.AI算法服务 6.任务算法服务 7.第三方服务 8.3DTiles服务
     * @param Type 接口分类0. 其他服务 1. IOT服务 2. 空间服务 3.微应用服务 4.场景服务 5.AI算法服务 6.任务算法服务 7.第三方服务 8.3DTiles服务
     */
    public void setType(Long [] Type) {
        this.Type = Type;
    }

    public DescribeInterfaceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInterfaceListRequest(DescribeInterfaceListRequest source) {
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Style != null) {
            this.Style = new Long[source.Style.length];
            for (int i = 0; i < source.Style.length; i++) {
                this.Style[i] = new Long(source.Style[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new Long(source.Type[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "Style.", this.Style);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);

    }
}

