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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrossRegionStatus extends AbstractModel{

    /**
    * 跨地域备份目标地域
    */
    @SerializedName("CrossRegion")
    @Expose
    private String CrossRegion;

    /**
    * 备份跨地域的同步状态 0-创建中；1-成功；2-失败；4-同步中
    */
    @SerializedName("CrossStatus")
    @Expose
    private Long CrossStatus;

    /**
     * Get 跨地域备份目标地域 
     * @return CrossRegion 跨地域备份目标地域
     */
    public String getCrossRegion() {
        return this.CrossRegion;
    }

    /**
     * Set 跨地域备份目标地域
     * @param CrossRegion 跨地域备份目标地域
     */
    public void setCrossRegion(String CrossRegion) {
        this.CrossRegion = CrossRegion;
    }

    /**
     * Get 备份跨地域的同步状态 0-创建中；1-成功；2-失败；4-同步中 
     * @return CrossStatus 备份跨地域的同步状态 0-创建中；1-成功；2-失败；4-同步中
     */
    public Long getCrossStatus() {
        return this.CrossStatus;
    }

    /**
     * Set 备份跨地域的同步状态 0-创建中；1-成功；2-失败；4-同步中
     * @param CrossStatus 备份跨地域的同步状态 0-创建中；1-成功；2-失败；4-同步中
     */
    public void setCrossStatus(Long CrossStatus) {
        this.CrossStatus = CrossStatus;
    }

    public CrossRegionStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossRegionStatus(CrossRegionStatus source) {
        if (source.CrossRegion != null) {
            this.CrossRegion = new String(source.CrossRegion);
        }
        if (source.CrossStatus != null) {
            this.CrossStatus = new Long(source.CrossStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CrossRegion", this.CrossRegion);
        this.setParamSimple(map, prefix + "CrossStatus", this.CrossStatus);

    }
}

