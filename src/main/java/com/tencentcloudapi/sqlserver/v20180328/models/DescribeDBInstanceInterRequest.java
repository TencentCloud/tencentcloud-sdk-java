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

public class DescribeDBInstanceInterRequest extends AbstractModel{

    /**
    * 分页，页大小，范围是1-100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 按照实例ID筛选
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 按照状态筛选 1-互通ip prot打开中；2-互通ip prot已经打开；3-加入到互通组中；4-已加入到互通组；5-互通ip prot回收中；6-互通ip prot已回收；7-从互通组移除中；8-已从互通组中移除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例版本代号列表
    */
    @SerializedName("VersionSet")
    @Expose
    private String [] VersionSet;

    /**
    * 实例所在可用区，格式如：ap-guangzhou-2
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 分页，页数，默认是0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 分页，页大小，范围是1-100 
     * @return Limit 分页，页大小，范围是1-100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页，页大小，范围是1-100
     * @param Limit 分页，页大小，范围是1-100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 按照实例ID筛选 
     * @return InstanceId 按照实例ID筛选
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 按照实例ID筛选
     * @param InstanceId 按照实例ID筛选
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 按照状态筛选 1-互通ip prot打开中；2-互通ip prot已经打开；3-加入到互通组中；4-已加入到互通组；5-互通ip prot回收中；6-互通ip prot已回收；7-从互通组移除中；8-已从互通组中移除 
     * @return Status 按照状态筛选 1-互通ip prot打开中；2-互通ip prot已经打开；3-加入到互通组中；4-已加入到互通组；5-互通ip prot回收中；6-互通ip prot已回收；7-从互通组移除中；8-已从互通组中移除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 按照状态筛选 1-互通ip prot打开中；2-互通ip prot已经打开；3-加入到互通组中；4-已加入到互通组；5-互通ip prot回收中；6-互通ip prot已回收；7-从互通组移除中；8-已从互通组中移除
     * @param Status 按照状态筛选 1-互通ip prot打开中；2-互通ip prot已经打开；3-加入到互通组中；4-已加入到互通组；5-互通ip prot回收中；6-互通ip prot已回收；7-从互通组移除中；8-已从互通组中移除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例版本代号列表 
     * @return VersionSet 实例版本代号列表
     */
    public String [] getVersionSet() {
        return this.VersionSet;
    }

    /**
     * Set 实例版本代号列表
     * @param VersionSet 实例版本代号列表
     */
    public void setVersionSet(String [] VersionSet) {
        this.VersionSet = VersionSet;
    }

    /**
     * Get 实例所在可用区，格式如：ap-guangzhou-2 
     * @return Zone 实例所在可用区，格式如：ap-guangzhou-2
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所在可用区，格式如：ap-guangzhou-2
     * @param Zone 实例所在可用区，格式如：ap-guangzhou-2
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 分页，页数，默认是0 
     * @return Offset 分页，页数，默认是0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页，页数，默认是0
     * @param Offset 分页，页数，默认是0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeDBInstanceInterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceInterRequest(DescribeDBInstanceInterRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VersionSet != null) {
            this.VersionSet = new String[source.VersionSet.length];
            for (int i = 0; i < source.VersionSet.length; i++) {
                this.VersionSet[i] = new String(source.VersionSet[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "VersionSet.", this.VersionSet);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

