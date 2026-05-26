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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PostgreSQLInfo extends AbstractModel {

    /**
    * <p>数据库名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>数据库引擎版本</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get <p>数据库名称</p> 
     * @return Name <p>数据库名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据库名称</p>
     * @param Name <p>数据库名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>实例id</p> 
     * @return InstanceName <p>实例id</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceName <p>实例id</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例状态</p> 
     * @return Status <p>实例状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态</p>
     * @param Status <p>实例状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>数据库引擎版本</p> 
     * @return Version <p>数据库引擎版本</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>数据库引擎版本</p>
     * @param Version <p>数据库引擎版本</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public PostgreSQLInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostgreSQLInfo(PostgreSQLInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

