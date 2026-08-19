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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAssetTagsRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 资产RID列表
    */
    @SerializedName("AssetRIDs")
    @Expose
    private String [] AssetRIDs;

    /**
    * 标签ID列表
    */
    @SerializedName("TagIDs")
    @Expose
    private String [] TagIDs;

    /**
    * 操作类型
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 资产RID列表 
     * @return AssetRIDs 资产RID列表
     */
    public String [] getAssetRIDs() {
        return this.AssetRIDs;
    }

    /**
     * Set 资产RID列表
     * @param AssetRIDs 资产RID列表
     */
    public void setAssetRIDs(String [] AssetRIDs) {
        this.AssetRIDs = AssetRIDs;
    }

    /**
     * Get 标签ID列表 
     * @return TagIDs 标签ID列表
     */
    public String [] getTagIDs() {
        return this.TagIDs;
    }

    /**
     * Set 标签ID列表
     * @param TagIDs 标签ID列表
     */
    public void setTagIDs(String [] TagIDs) {
        this.TagIDs = TagIDs;
    }

    /**
     * Get 操作类型 
     * @return OperationType 操作类型
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型
     * @param OperationType 操作类型
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    public ModifyAssetTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAssetTagsRequest(ModifyAssetTagsRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AssetRIDs != null) {
            this.AssetRIDs = new String[source.AssetRIDs.length];
            for (int i = 0; i < source.AssetRIDs.length; i++) {
                this.AssetRIDs[i] = new String(source.AssetRIDs[i]);
            }
        }
        if (source.TagIDs != null) {
            this.TagIDs = new String[source.TagIDs.length];
            for (int i = 0; i < source.TagIDs.length; i++) {
                this.TagIDs[i] = new String(source.TagIDs[i]);
            }
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "AssetRIDs.", this.AssetRIDs);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);

    }
}

