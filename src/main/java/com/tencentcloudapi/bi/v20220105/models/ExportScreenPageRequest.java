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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportScreenPageRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 页面id
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
    * 画布类型。栅格画布：GRID；自由画布：FREE
    */
    @SerializedName("CanvasType")
    @Expose
    private String CanvasType;

    /**
    * 图片导出类型。base64；url（有效期：1天）
    */
    @SerializedName("PicType")
    @Expose
    private String PicType;

    /**
    * 组件Ids。为空时，导出整个页面
    */
    @SerializedName("WidgetIds")
    @Expose
    private String [] WidgetIds;

    /**
    * 是否是异步请求
    */
    @SerializedName("AsyncRequest")
    @Expose
    private Boolean AsyncRequest;

    /**
    * 事务id
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 页面id 
     * @return PageId 页面id
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set 页面id
     * @param PageId 页面id
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    /**
     * Get 画布类型。栅格画布：GRID；自由画布：FREE 
     * @return CanvasType 画布类型。栅格画布：GRID；自由画布：FREE
     */
    public String getCanvasType() {
        return this.CanvasType;
    }

    /**
     * Set 画布类型。栅格画布：GRID；自由画布：FREE
     * @param CanvasType 画布类型。栅格画布：GRID；自由画布：FREE
     */
    public void setCanvasType(String CanvasType) {
        this.CanvasType = CanvasType;
    }

    /**
     * Get 图片导出类型。base64；url（有效期：1天） 
     * @return PicType 图片导出类型。base64；url（有效期：1天）
     */
    public String getPicType() {
        return this.PicType;
    }

    /**
     * Set 图片导出类型。base64；url（有效期：1天）
     * @param PicType 图片导出类型。base64；url（有效期：1天）
     */
    public void setPicType(String PicType) {
        this.PicType = PicType;
    }

    /**
     * Get 组件Ids。为空时，导出整个页面 
     * @return WidgetIds 组件Ids。为空时，导出整个页面
     */
    public String [] getWidgetIds() {
        return this.WidgetIds;
    }

    /**
     * Set 组件Ids。为空时，导出整个页面
     * @param WidgetIds 组件Ids。为空时，导出整个页面
     */
    public void setWidgetIds(String [] WidgetIds) {
        this.WidgetIds = WidgetIds;
    }

    /**
     * Get 是否是异步请求 
     * @return AsyncRequest 是否是异步请求
     */
    public Boolean getAsyncRequest() {
        return this.AsyncRequest;
    }

    /**
     * Set 是否是异步请求
     * @param AsyncRequest 是否是异步请求
     */
    public void setAsyncRequest(Boolean AsyncRequest) {
        this.AsyncRequest = AsyncRequest;
    }

    /**
     * Get 事务id 
     * @return TranId 事务id
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set 事务id
     * @param TranId 事务id
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    public ExportScreenPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportScreenPageRequest(ExportScreenPageRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
        if (source.CanvasType != null) {
            this.CanvasType = new String(source.CanvasType);
        }
        if (source.PicType != null) {
            this.PicType = new String(source.PicType);
        }
        if (source.WidgetIds != null) {
            this.WidgetIds = new String[source.WidgetIds.length];
            for (int i = 0; i < source.WidgetIds.length; i++) {
                this.WidgetIds[i] = new String(source.WidgetIds[i]);
            }
        }
        if (source.AsyncRequest != null) {
            this.AsyncRequest = new Boolean(source.AsyncRequest);
        }
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "CanvasType", this.CanvasType);
        this.setParamSimple(map, prefix + "PicType", this.PicType);
        this.setParamArraySimple(map, prefix + "WidgetIds.", this.WidgetIds);
        this.setParamSimple(map, prefix + "AsyncRequest", this.AsyncRequest);
        this.setParamSimple(map, prefix + "TranId", this.TranId);

    }
}

