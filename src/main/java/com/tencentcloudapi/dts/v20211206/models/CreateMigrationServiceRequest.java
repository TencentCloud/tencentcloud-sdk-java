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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMigrationServiceRequest extends AbstractModel{

    /**
    * 源实例数据库类型，mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * 目标实例数据库类型，mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * 源实例地域，如：ap-guangzhou
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * 目标实例地域，如：ap-guangzhou。注意，目标地域必须和API请求地域保持一致。
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * 实例规格，包括：small、medium、large、xlarge、2xlarge
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * 购买数量，范围为[1,15]，默认为1
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 迁移服务名称，最大长度128
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 标签信息
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
     * Get 源实例数据库类型，mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb 
     * @return SrcDatabaseType 源实例数据库类型，mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set 源实例数据库类型，mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb
     * @param SrcDatabaseType 源实例数据库类型，mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get 目标实例数据库类型，mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb 
     * @return DstDatabaseType 目标实例数据库类型，mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set 目标实例数据库类型，mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb
     * @param DstDatabaseType 目标实例数据库类型，mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get 源实例地域，如：ap-guangzhou 
     * @return SrcRegion 源实例地域，如：ap-guangzhou
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set 源实例地域，如：ap-guangzhou
     * @param SrcRegion 源实例地域，如：ap-guangzhou
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get 目标实例地域，如：ap-guangzhou。注意，目标地域必须和API请求地域保持一致。 
     * @return DstRegion 目标实例地域，如：ap-guangzhou。注意，目标地域必须和API请求地域保持一致。
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set 目标实例地域，如：ap-guangzhou。注意，目标地域必须和API请求地域保持一致。
     * @param DstRegion 目标实例地域，如：ap-guangzhou。注意，目标地域必须和API请求地域保持一致。
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get 实例规格，包括：small、medium、large、xlarge、2xlarge 
     * @return InstanceClass 实例规格，包括：small、medium、large、xlarge、2xlarge
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set 实例规格，包括：small、medium、large、xlarge、2xlarge
     * @param InstanceClass 实例规格，包括：small、medium、large、xlarge、2xlarge
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
    }

    /**
     * Get 购买数量，范围为[1,15]，默认为1 
     * @return Count 购买数量，范围为[1,15]，默认为1
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 购买数量，范围为[1,15]，默认为1
     * @param Count 购买数量，范围为[1,15]，默认为1
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 迁移服务名称，最大长度128 
     * @return JobName 迁移服务名称，最大长度128
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 迁移服务名称，最大长度128
     * @param JobName 迁移服务名称，最大长度128
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 标签信息 
     * @return Tags 标签信息
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息
     * @param Tags 标签信息
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    public CreateMigrationServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMigrationServiceRequest(CreateMigrationServiceRequest source) {
        if (source.SrcDatabaseType != null) {
            this.SrcDatabaseType = new String(source.SrcDatabaseType);
        }
        if (source.DstDatabaseType != null) {
            this.DstDatabaseType = new String(source.DstDatabaseType);
        }
        if (source.SrcRegion != null) {
            this.SrcRegion = new String(source.SrcRegion);
        }
        if (source.DstRegion != null) {
            this.DstRegion = new String(source.DstRegion);
        }
        if (source.InstanceClass != null) {
            this.InstanceClass = new String(source.InstanceClass);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);
        this.setParamSimple(map, prefix + "SrcRegion", this.SrcRegion);
        this.setParamSimple(map, prefix + "DstRegion", this.DstRegion);
        this.setParamSimple(map, prefix + "InstanceClass", this.InstanceClass);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

