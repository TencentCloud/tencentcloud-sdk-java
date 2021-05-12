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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckAssetItem extends AbstractModel{

    /**
    * 检查项下资产组ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 资产组实例id
    */
    @SerializedName("Instid")
    @Expose
    private String Instid;

    /**
    * 处置跳转URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 检查任务id
    */
    @SerializedName("Taskid")
    @Expose
    private String Taskid;

    /**
    * 检查结果
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 更新时间
    */
    @SerializedName("Updatetime")
    @Expose
    private String Updatetime;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 是否忽略
    */
    @SerializedName("IsIgnore")
    @Expose
    private Long IsIgnore;

    /**
    * 检查状态
    */
    @SerializedName("IsChecked")
    @Expose
    private Long IsChecked;

    /**
    * 资产组信息
    */
    @SerializedName("AssetInfo")
    @Expose
    private String AssetInfo;

    /**
    * 资产组ES的_id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 详情
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 备注内容
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
     * Get 检查项下资产组ID 
     * @return Id 检查项下资产组ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 检查项下资产组ID
     * @param Id 检查项下资产组ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 资产组实例id 
     * @return Instid 资产组实例id
     */
    public String getInstid() {
        return this.Instid;
    }

    /**
     * Set 资产组实例id
     * @param Instid 资产组实例id
     */
    public void setInstid(String Instid) {
        this.Instid = Instid;
    }

    /**
     * Get 处置跳转URL 
     * @return Url 处置跳转URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 处置跳转URL
     * @param Url 处置跳转URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 检查任务id 
     * @return Taskid 检查任务id
     */
    public String getTaskid() {
        return this.Taskid;
    }

    /**
     * Set 检查任务id
     * @param Taskid 检查任务id
     */
    public void setTaskid(String Taskid) {
        this.Taskid = Taskid;
    }

    /**
     * Get 检查结果 
     * @return Result 检查结果
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 检查结果
     * @param Result 检查结果
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 更新时间 
     * @return Updatetime 更新时间
     */
    public String getUpdatetime() {
        return this.Updatetime;
    }

    /**
     * Set 更新时间
     * @param Updatetime 更新时间
     */
    public void setUpdatetime(String Updatetime) {
        this.Updatetime = Updatetime;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 是否忽略 
     * @return IsIgnore 是否忽略
     */
    public Long getIsIgnore() {
        return this.IsIgnore;
    }

    /**
     * Set 是否忽略
     * @param IsIgnore 是否忽略
     */
    public void setIsIgnore(Long IsIgnore) {
        this.IsIgnore = IsIgnore;
    }

    /**
     * Get 检查状态 
     * @return IsChecked 检查状态
     */
    public Long getIsChecked() {
        return this.IsChecked;
    }

    /**
     * Set 检查状态
     * @param IsChecked 检查状态
     */
    public void setIsChecked(Long IsChecked) {
        this.IsChecked = IsChecked;
    }

    /**
     * Get 资产组信息 
     * @return AssetInfo 资产组信息
     */
    public String getAssetInfo() {
        return this.AssetInfo;
    }

    /**
     * Set 资产组信息
     * @param AssetInfo 资产组信息
     */
    public void setAssetInfo(String AssetInfo) {
        this.AssetInfo = AssetInfo;
    }

    /**
     * Get 资产组ES的_id 
     * @return AssetId 资产组ES的_id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产组ES的_id
     * @param AssetId 资产组ES的_id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 详情 
     * @return Detail 详情
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 详情
     * @param Detail 详情
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 备注内容 
     * @return Remarks 备注内容
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set 备注内容
     * @param Remarks 备注内容
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    public CheckAssetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckAssetItem(CheckAssetItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Instid != null) {
            this.Instid = new String(source.Instid);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Taskid != null) {
            this.Taskid = new String(source.Taskid);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Updatetime != null) {
            this.Updatetime = new String(source.Updatetime);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.IsIgnore != null) {
            this.IsIgnore = new Long(source.IsIgnore);
        }
        if (source.IsChecked != null) {
            this.IsChecked = new Long(source.IsChecked);
        }
        if (source.AssetInfo != null) {
            this.AssetInfo = new String(source.AssetInfo);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Remarks != null) {
            this.Remarks = new String(source.Remarks);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Instid", this.Instid);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Taskid", this.Taskid);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Updatetime", this.Updatetime);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "IsIgnore", this.IsIgnore);
        this.setParamSimple(map, prefix + "IsChecked", this.IsChecked);
        this.setParamSimple(map, prefix + "AssetInfo", this.AssetInfo);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);

    }
}

