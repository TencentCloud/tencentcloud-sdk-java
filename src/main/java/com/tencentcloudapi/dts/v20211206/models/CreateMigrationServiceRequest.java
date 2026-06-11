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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMigrationServiceRequest extends AbstractModel {

    /**
    * <p>源实例数据库类型，如mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb,cynosdbmysql(表示TDSQL-C MySQL数据库)tdsqlmysql,keewidb,tdstore</p><p>枚举值：</p><ul><li>mysql： MySQL数据库</li></ul>
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * <p>目标实例数据库类型，如mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb,cynosdbmysql(表示TDSQL-C MySQL数据库)tdsqlmysql,keewidb,tdstore,tendis</p><p>枚举值：</p><ul><li>mysql： MySQL数据库</li></ul>
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * <p>源实例地域，如：ap-guangzhou</p>
    */
    @SerializedName("SrcRegion")
    @Expose
    private String SrcRegion;

    /**
    * <p>目标实例地域，如：ap-guangzhou。注意，目标地域必须和API请求地域保持一致。</p>
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * <p>实例规格，包括：small、medium、large、xlarge、2xlarge。当前未计费链路仅支持medium字段值。不同规格类型参考<a href="https://cloud.tencent.com/document/product/571/18736">计费概述</a></p>
    */
    @SerializedName("InstanceClass")
    @Expose
    private String InstanceClass;

    /**
    * <p>购买数量，范围为[1,15]，默认为1</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>迁移服务名称，最大长度128</p>
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
     * Get <p>源实例数据库类型，如mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb,cynosdbmysql(表示TDSQL-C MySQL数据库)tdsqlmysql,keewidb,tdstore</p><p>枚举值：</p><ul><li>mysql： MySQL数据库</li></ul> 
     * @return SrcDatabaseType <p>源实例数据库类型，如mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb,cynosdbmysql(表示TDSQL-C MySQL数据库)tdsqlmysql,keewidb,tdstore</p><p>枚举值：</p><ul><li>mysql： MySQL数据库</li></ul>
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set <p>源实例数据库类型，如mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb,cynosdbmysql(表示TDSQL-C MySQL数据库)tdsqlmysql,keewidb,tdstore</p><p>枚举值：</p><ul><li>mysql： MySQL数据库</li></ul>
     * @param SrcDatabaseType <p>源实例数据库类型，如mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb,cynosdbmysql(表示TDSQL-C MySQL数据库)tdsqlmysql,keewidb,tdstore</p><p>枚举值：</p><ul><li>mysql： MySQL数据库</li></ul>
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get <p>目标实例数据库类型，如mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb,cynosdbmysql(表示TDSQL-C MySQL数据库)tdsqlmysql,keewidb,tdstore,tendis</p><p>枚举值：</p><ul><li>mysql： MySQL数据库</li></ul> 
     * @return DstDatabaseType <p>目标实例数据库类型，如mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb,cynosdbmysql(表示TDSQL-C MySQL数据库)tdsqlmysql,keewidb,tdstore,tendis</p><p>枚举值：</p><ul><li>mysql： MySQL数据库</li></ul>
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set <p>目标实例数据库类型，如mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb,cynosdbmysql(表示TDSQL-C MySQL数据库)tdsqlmysql,keewidb,tdstore,tendis</p><p>枚举值：</p><ul><li>mysql： MySQL数据库</li></ul>
     * @param DstDatabaseType <p>目标实例数据库类型，如mysql,redis,percona,mongodb,postgresql,sqlserver,mariadb,cynosdbmysql(表示TDSQL-C MySQL数据库)tdsqlmysql,keewidb,tdstore,tendis</p><p>枚举值：</p><ul><li>mysql： MySQL数据库</li></ul>
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get <p>源实例地域，如：ap-guangzhou</p> 
     * @return SrcRegion <p>源实例地域，如：ap-guangzhou</p>
     */
    public String getSrcRegion() {
        return this.SrcRegion;
    }

    /**
     * Set <p>源实例地域，如：ap-guangzhou</p>
     * @param SrcRegion <p>源实例地域，如：ap-guangzhou</p>
     */
    public void setSrcRegion(String SrcRegion) {
        this.SrcRegion = SrcRegion;
    }

    /**
     * Get <p>目标实例地域，如：ap-guangzhou。注意，目标地域必须和API请求地域保持一致。</p> 
     * @return DstRegion <p>目标实例地域，如：ap-guangzhou。注意，目标地域必须和API请求地域保持一致。</p>
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set <p>目标实例地域，如：ap-guangzhou。注意，目标地域必须和API请求地域保持一致。</p>
     * @param DstRegion <p>目标实例地域，如：ap-guangzhou。注意，目标地域必须和API请求地域保持一致。</p>
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get <p>实例规格，包括：small、medium、large、xlarge、2xlarge。当前未计费链路仅支持medium字段值。不同规格类型参考<a href="https://cloud.tencent.com/document/product/571/18736">计费概述</a></p> 
     * @return InstanceClass <p>实例规格，包括：small、medium、large、xlarge、2xlarge。当前未计费链路仅支持medium字段值。不同规格类型参考<a href="https://cloud.tencent.com/document/product/571/18736">计费概述</a></p>
     */
    public String getInstanceClass() {
        return this.InstanceClass;
    }

    /**
     * Set <p>实例规格，包括：small、medium、large、xlarge、2xlarge。当前未计费链路仅支持medium字段值。不同规格类型参考<a href="https://cloud.tencent.com/document/product/571/18736">计费概述</a></p>
     * @param InstanceClass <p>实例规格，包括：small、medium、large、xlarge、2xlarge。当前未计费链路仅支持medium字段值。不同规格类型参考<a href="https://cloud.tencent.com/document/product/571/18736">计费概述</a></p>
     */
    public void setInstanceClass(String InstanceClass) {
        this.InstanceClass = InstanceClass;
    }

    /**
     * Get <p>购买数量，范围为[1,15]，默认为1</p> 
     * @return Count <p>购买数量，范围为[1,15]，默认为1</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>购买数量，范围为[1,15]，默认为1</p>
     * @param Count <p>购买数量，范围为[1,15]，默认为1</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>迁移服务名称，最大长度128</p> 
     * @return JobName <p>迁移服务名称，最大长度128</p>
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set <p>迁移服务名称，最大长度128</p>
     * @param JobName <p>迁移服务名称，最大长度128</p>
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get <p>标签信息</p> 
     * @return Tags <p>标签信息</p>
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
     * @param Tags <p>标签信息</p>
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

