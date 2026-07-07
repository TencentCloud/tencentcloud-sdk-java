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

public class ModifyDspmIdentifyLevelItemRequest extends AbstractModel {

    /**
    * <p>级别组id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>级别组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>敏感程度分</p><p>取值范围：[1, 10]</p><p>单位：敏感程度</p>
    */
    @SerializedName("LevelScore")
    @Expose
    private Long LevelScore;

    /**
     * Get <p>级别组id</p> 
     * @return Id <p>级别组id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>级别组id</p>
     * @param Id <p>级别组id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>级别组名称</p> 
     * @return Name <p>级别组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>级别组名称</p>
     * @param Name <p>级别组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

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
     * Get <p>敏感程度分</p><p>取值范围：[1, 10]</p><p>单位：敏感程度</p> 
     * @return LevelScore <p>敏感程度分</p><p>取值范围：[1, 10]</p><p>单位：敏感程度</p>
     */
    public Long getLevelScore() {
        return this.LevelScore;
    }

    /**
     * Set <p>敏感程度分</p><p>取值范围：[1, 10]</p><p>单位：敏感程度</p>
     * @param LevelScore <p>敏感程度分</p><p>取值范围：[1, 10]</p><p>单位：敏感程度</p>
     */
    public void setLevelScore(Long LevelScore) {
        this.LevelScore = LevelScore;
    }

    public ModifyDspmIdentifyLevelItemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmIdentifyLevelItemRequest(ModifyDspmIdentifyLevelItemRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.LevelScore != null) {
            this.LevelScore = new Long(source.LevelScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "LevelScore", this.LevelScore);

    }
}

