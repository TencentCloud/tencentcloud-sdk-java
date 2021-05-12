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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseRunVersionSnapshotRequest extends AbstractModel{

    /**
    * 服务名
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 版本名
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 版本历史名
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 偏移量。默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制大小。默认10，最大20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 服务名 
     * @return ServerName 服务名
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名
     * @param ServerName 服务名
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 版本名 
     * @return VersionName 版本名
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名
     * @param VersionName 版本名
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 版本历史名 
     * @return SnapshotName 版本历史名
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 版本历史名
     * @param SnapshotName 版本历史名
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 偏移量。默认0 
     * @return Offset 偏移量。默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。默认0
     * @param Offset 偏移量。默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制大小。默认10，最大20 
     * @return Limit 限制大小。默认10，最大20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制大小。默认10，最大20
     * @param Limit 限制大小。默认10，最大20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCloudBaseRunVersionSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseRunVersionSnapshotRequest(DescribeCloudBaseRunVersionSnapshotRequest source) {
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

