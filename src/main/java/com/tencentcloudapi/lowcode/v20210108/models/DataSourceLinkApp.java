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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSourceLinkApp extends AbstractModel {

    /**
    * 应用Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 应用名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 是否编辑状态使用
    */
    @SerializedName("EditStatusUse")
    @Expose
    private Long EditStatusUse;

    /**
    * 是否预览状态使用
    */
    @SerializedName("PreviewStatusUse")
    @Expose
    private Long PreviewStatusUse;

    /**
    * 是否正式状态使用
    */
    @SerializedName("OnlineStatusUse")
    @Expose
    private Long OnlineStatusUse;

    /**
    * 数据源ID
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
     * Get 应用Id 
     * @return Id 应用Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 应用Id
     * @param Id 应用Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 应用名称 
     * @return Title 应用名称
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 应用名称
     * @param Title 应用名称
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 是否编辑状态使用 
     * @return EditStatusUse 是否编辑状态使用
     */
    public Long getEditStatusUse() {
        return this.EditStatusUse;
    }

    /**
     * Set 是否编辑状态使用
     * @param EditStatusUse 是否编辑状态使用
     */
    public void setEditStatusUse(Long EditStatusUse) {
        this.EditStatusUse = EditStatusUse;
    }

    /**
     * Get 是否预览状态使用 
     * @return PreviewStatusUse 是否预览状态使用
     */
    public Long getPreviewStatusUse() {
        return this.PreviewStatusUse;
    }

    /**
     * Set 是否预览状态使用
     * @param PreviewStatusUse 是否预览状态使用
     */
    public void setPreviewStatusUse(Long PreviewStatusUse) {
        this.PreviewStatusUse = PreviewStatusUse;
    }

    /**
     * Get 是否正式状态使用 
     * @return OnlineStatusUse 是否正式状态使用
     */
    public Long getOnlineStatusUse() {
        return this.OnlineStatusUse;
    }

    /**
     * Set 是否正式状态使用
     * @param OnlineStatusUse 是否正式状态使用
     */
    public void setOnlineStatusUse(Long OnlineStatusUse) {
        this.OnlineStatusUse = OnlineStatusUse;
    }

    /**
     * Get 数据源ID 
     * @return DataSourceId 数据源ID
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源ID
     * @param DataSourceId 数据源ID
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    public DataSourceLinkApp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceLinkApp(DataSourceLinkApp source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.EditStatusUse != null) {
            this.EditStatusUse = new Long(source.EditStatusUse);
        }
        if (source.PreviewStatusUse != null) {
            this.PreviewStatusUse = new Long(source.PreviewStatusUse);
        }
        if (source.OnlineStatusUse != null) {
            this.OnlineStatusUse = new Long(source.OnlineStatusUse);
        }
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "EditStatusUse", this.EditStatusUse);
        this.setParamSimple(map, prefix + "PreviewStatusUse", this.PreviewStatusUse);
        this.setParamSimple(map, prefix + "OnlineStatusUse", this.OnlineStatusUse);
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);

    }
}

