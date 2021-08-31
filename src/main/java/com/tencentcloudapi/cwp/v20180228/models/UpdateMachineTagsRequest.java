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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateMachineTagsRequest extends AbstractModel{

    /**
    * 机器 Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 服务器地区 如: ap-guangzhou
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * 服务器类型(CVM|BM|ECM|LH|Other)
    */
    @SerializedName("MachineArea")
    @Expose
    private String MachineArea;

    /**
    * 标签ID，该操作会覆盖原有的标签列表
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
     * Get 机器 Quuid 
     * @return Quuid 机器 Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 机器 Quuid
     * @param Quuid 机器 Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 服务器地区 如: ap-guangzhou 
     * @return MachineRegion 服务器地区 如: ap-guangzhou
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set 服务器地区 如: ap-guangzhou
     * @param MachineRegion 服务器地区 如: ap-guangzhou
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get 服务器类型(CVM|BM|ECM|LH|Other) 
     * @return MachineArea 服务器类型(CVM|BM|ECM|LH|Other)
     */
    public String getMachineArea() {
        return this.MachineArea;
    }

    /**
     * Set 服务器类型(CVM|BM|ECM|LH|Other)
     * @param MachineArea 服务器类型(CVM|BM|ECM|LH|Other)
     */
    public void setMachineArea(String MachineArea) {
        this.MachineArea = MachineArea;
    }

    /**
     * Get 标签ID，该操作会覆盖原有的标签列表 
     * @return TagIds 标签ID，该操作会覆盖原有的标签列表
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set 标签ID，该操作会覆盖原有的标签列表
     * @param TagIds 标签ID，该操作会覆盖原有的标签列表
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    public UpdateMachineTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateMachineTagsRequest(UpdateMachineTagsRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
        if (source.MachineArea != null) {
            this.MachineArea = new String(source.MachineArea);
        }
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamSimple(map, prefix + "MachineArea", this.MachineArea);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);

    }
}

