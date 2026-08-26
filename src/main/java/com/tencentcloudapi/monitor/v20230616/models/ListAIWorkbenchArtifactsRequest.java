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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAIWorkbenchArtifactsRequest extends AbstractModel {

    /**
    * <p>每页数量</p>
    */
    @SerializedName("PerPage")
    @Expose
    private Long PerPage;

    /**
    * <p>页码</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>会话ID</p>
    */
    @SerializedName("SessionIds")
    @Expose
    private String [] SessionIds;

    /**
    * <p>消息内容类型</p>
    */
    @SerializedName("MimeTypes")
    @Expose
    private String [] MimeTypes;

    /**
    * <p>排序</p><p>枚举值：</p><ul><li>ASC： 正序</li><li>DESC： 倒序</li></ul>
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get <p>每页数量</p> 
     * @return PerPage <p>每页数量</p>
     */
    public Long getPerPage() {
        return this.PerPage;
    }

    /**
     * Set <p>每页数量</p>
     * @param PerPage <p>每页数量</p>
     */
    public void setPerPage(Long PerPage) {
        this.PerPage = PerPage;
    }

    /**
     * Get <p>页码</p> 
     * @return PageNo <p>页码</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>页码</p>
     * @param PageNo <p>页码</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>会话ID</p> 
     * @return SessionIds <p>会话ID</p>
     */
    public String [] getSessionIds() {
        return this.SessionIds;
    }

    /**
     * Set <p>会话ID</p>
     * @param SessionIds <p>会话ID</p>
     */
    public void setSessionIds(String [] SessionIds) {
        this.SessionIds = SessionIds;
    }

    /**
     * Get <p>消息内容类型</p> 
     * @return MimeTypes <p>消息内容类型</p>
     */
    public String [] getMimeTypes() {
        return this.MimeTypes;
    }

    /**
     * Set <p>消息内容类型</p>
     * @param MimeTypes <p>消息内容类型</p>
     */
    public void setMimeTypes(String [] MimeTypes) {
        this.MimeTypes = MimeTypes;
    }

    /**
     * Get <p>排序</p><p>枚举值：</p><ul><li>ASC： 正序</li><li>DESC： 倒序</li></ul> 
     * @return OrderDirection <p>排序</p><p>枚举值：</p><ul><li>ASC： 正序</li><li>DESC： 倒序</li></ul>
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set <p>排序</p><p>枚举值：</p><ul><li>ASC： 正序</li><li>DESC： 倒序</li></ul>
     * @param OrderDirection <p>排序</p><p>枚举值：</p><ul><li>ASC： 正序</li><li>DESC： 倒序</li></ul>
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public ListAIWorkbenchArtifactsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAIWorkbenchArtifactsRequest(ListAIWorkbenchArtifactsRequest source) {
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.SessionIds != null) {
            this.SessionIds = new String[source.SessionIds.length];
            for (int i = 0; i < source.SessionIds.length; i++) {
                this.SessionIds[i] = new String(source.SessionIds[i]);
            }
        }
        if (source.MimeTypes != null) {
            this.MimeTypes = new String[source.MimeTypes.length];
            for (int i = 0; i < source.MimeTypes.length; i++) {
                this.MimeTypes[i] = new String(source.MimeTypes[i]);
            }
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamArraySimple(map, prefix + "SessionIds.", this.SessionIds);
        this.setParamArraySimple(map, prefix + "MimeTypes.", this.MimeTypes);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

