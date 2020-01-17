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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddMachineTagRequest extends AbstractModel{

    /**
    * 云服务器ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 标签ID
    */
    @SerializedName("TagId")
    @Expose
    private Long TagId;

    /**
    * 云服务器地区
    */
    @SerializedName("MRegion")
    @Expose
    private String MRegion;

    /**
    * 云服务器类型(CVM|BM)
    */
    @SerializedName("MArea")
    @Expose
    private String MArea;

    /**
     * Get 云服务器ID 
     * @return Quuid 云服务器ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 云服务器ID
     * @param Quuid 云服务器ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 标签ID 
     * @return TagId 标签ID
     */
    public Long getTagId() {
        return this.TagId;
    }

    /**
     * Set 标签ID
     * @param TagId 标签ID
     */
    public void setTagId(Long TagId) {
        this.TagId = TagId;
    }

    /**
     * Get 云服务器地区 
     * @return MRegion 云服务器地区
     */
    public String getMRegion() {
        return this.MRegion;
    }

    /**
     * Set 云服务器地区
     * @param MRegion 云服务器地区
     */
    public void setMRegion(String MRegion) {
        this.MRegion = MRegion;
    }

    /**
     * Get 云服务器类型(CVM|BM) 
     * @return MArea 云服务器类型(CVM|BM)
     */
    public String getMArea() {
        return this.MArea;
    }

    /**
     * Set 云服务器类型(CVM|BM)
     * @param MArea 云服务器类型(CVM|BM)
     */
    public void setMArea(String MArea) {
        this.MArea = MArea;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "MRegion", this.MRegion);
        this.setParamSimple(map, prefix + "MArea", this.MArea);

    }
}

