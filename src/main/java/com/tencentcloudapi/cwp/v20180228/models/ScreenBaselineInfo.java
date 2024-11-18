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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenBaselineInfo extends AbstractModel {

    /**
    * 基线名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 危害等级：1-低危；2-中危；3-高危；4-严重
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 基线id
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 最后检测时间
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 基线风险项
    */
    @SerializedName("BaselineFailCount")
    @Expose
    private Long BaselineFailCount;

    /**
    * 主机uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get 基线名 
     * @return Name 基线名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 基线名
     * @param Name 基线名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 危害等级：1-低危；2-中危；3-高危；4-严重 
     * @return Level 危害等级：1-低危；2-中危；3-高危；4-严重
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 危害等级：1-低危；2-中危；3-高危；4-严重
     * @param Level 危害等级：1-低危；2-中危；3-高危；4-严重
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 基线id 
     * @return CategoryId 基线id
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 基线id
     * @param CategoryId 基线id
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 最后检测时间 
     * @return LastScanTime 最后检测时间
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最后检测时间
     * @param LastScanTime 最后检测时间
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 基线风险项 
     * @return BaselineFailCount 基线风险项
     */
    public Long getBaselineFailCount() {
        return this.BaselineFailCount;
    }

    /**
     * Set 基线风险项
     * @param BaselineFailCount 基线风险项
     */
    public void setBaselineFailCount(Long BaselineFailCount) {
        this.BaselineFailCount = BaselineFailCount;
    }

    /**
     * Get 主机uuid 
     * @return Uuid 主机uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机uuid
     * @param Uuid 主机uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public ScreenBaselineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenBaselineInfo(ScreenBaselineInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.BaselineFailCount != null) {
            this.BaselineFailCount = new Long(source.BaselineFailCount);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "BaselineFailCount", this.BaselineFailCount);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

