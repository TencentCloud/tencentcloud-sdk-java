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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDataSourceRequest extends AbstractModel{

    /**
    * 数据源名称，在相同SpaceName下，数据源名称不能为空
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据源类别：绑定引擎、绑定数据库
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 数据源类型:枚举值
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据源ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 业务侧数据源的配置信息扩展
    */
    @SerializedName("BizParams")
    @Expose
    private String BizParams;

    /**
    * 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * 数据源描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据源展示名，为了可视化查看
    */
    @SerializedName("Display")
    @Expose
    private String Display;

    /**
    * 若数据源列表为绑定数据库，则为db名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据源引擎的实例ID，如CDB实例ID
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * 数据源数据源的可见性，1为可见、0为不可见。默认为1
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 数据源所属的业务空间名称
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 是否采集
    */
    @SerializedName("Collect")
    @Expose
    private String Collect;

    /**
    * 项目id
    */
    @SerializedName("OwnerProjectId")
    @Expose
    private String OwnerProjectId;

    /**
    * 项目名称
    */
    @SerializedName("OwnerProjectName")
    @Expose
    private String OwnerProjectName;

    /**
    * 项目中文名
    */
    @SerializedName("OwnerProjectIdent")
    @Expose
    private String OwnerProjectIdent;

    /**
    * cos bucket
    */
    @SerializedName("COSBucket")
    @Expose
    private String COSBucket;

    /**
    * cos region
    */
    @SerializedName("COSRegion")
    @Expose
    private String COSRegion;

    /**
     * Get 数据源名称，在相同SpaceName下，数据源名称不能为空 
     * @return Name 数据源名称，在相同SpaceName下，数据源名称不能为空
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据源名称，在相同SpaceName下，数据源名称不能为空
     * @param Name 数据源名称，在相同SpaceName下，数据源名称不能为空
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据源类别：绑定引擎、绑定数据库 
     * @return Category 数据源类别：绑定引擎、绑定数据库
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 数据源类别：绑定引擎、绑定数据库
     * @param Category 数据源类别：绑定引擎、绑定数据库
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 数据源类型:枚举值 
     * @return Type 数据源类型:枚举值
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数据源类型:枚举值
     * @param Type 数据源类型:枚举值
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据源ID 
     * @return ID 数据源ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 数据源ID
     * @param ID 数据源ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 业务侧数据源的配置信息扩展 
     * @return BizParams 业务侧数据源的配置信息扩展
     */
    public String getBizParams() {
        return this.BizParams;
    }

    /**
     * Set 业务侧数据源的配置信息扩展
     * @param BizParams 业务侧数据源的配置信息扩展
     */
    public void setBizParams(String BizParams) {
        this.BizParams = BizParams;
    }

    /**
     * Get 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同 
     * @return Params 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
     * @param Params 数据源的配置信息，以JSON KV存储，根据每个数据源类型不同，而KV存储信息不同
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get 数据源描述信息 
     * @return Description 数据源描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 数据源描述信息
     * @param Description 数据源描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 数据源展示名，为了可视化查看 
     * @return Display 数据源展示名，为了可视化查看
     */
    public String getDisplay() {
        return this.Display;
    }

    /**
     * Set 数据源展示名，为了可视化查看
     * @param Display 数据源展示名，为了可视化查看
     */
    public void setDisplay(String Display) {
        this.Display = Display;
    }

    /**
     * Get 若数据源列表为绑定数据库，则为db名称 
     * @return DatabaseName 若数据源列表为绑定数据库，则为db名称
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 若数据源列表为绑定数据库，则为db名称
     * @param DatabaseName 若数据源列表为绑定数据库，则为db名称
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据源引擎的实例ID，如CDB实例ID 
     * @return Instance 数据源引擎的实例ID，如CDB实例ID
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set 数据源引擎的实例ID，如CDB实例ID
     * @param Instance 数据源引擎的实例ID，如CDB实例ID
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 数据源数据源的可见性，1为可见、0为不可见。默认为1 
     * @return Status 数据源数据源的可见性，1为可见、0为不可见。默认为1
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 数据源数据源的可见性，1为可见、0为不可见。默认为1
     * @param Status 数据源数据源的可见性，1为可见、0为不可见。默认为1
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 数据源所属的业务空间名称 
     * @return ClusterId 数据源所属的业务空间名称
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 数据源所属的业务空间名称
     * @param ClusterId 数据源所属的业务空间名称
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 是否采集 
     * @return Collect 是否采集
     */
    public String getCollect() {
        return this.Collect;
    }

    /**
     * Set 是否采集
     * @param Collect 是否采集
     */
    public void setCollect(String Collect) {
        this.Collect = Collect;
    }

    /**
     * Get 项目id 
     * @return OwnerProjectId 项目id
     */
    public String getOwnerProjectId() {
        return this.OwnerProjectId;
    }

    /**
     * Set 项目id
     * @param OwnerProjectId 项目id
     */
    public void setOwnerProjectId(String OwnerProjectId) {
        this.OwnerProjectId = OwnerProjectId;
    }

    /**
     * Get 项目名称 
     * @return OwnerProjectName 项目名称
     */
    public String getOwnerProjectName() {
        return this.OwnerProjectName;
    }

    /**
     * Set 项目名称
     * @param OwnerProjectName 项目名称
     */
    public void setOwnerProjectName(String OwnerProjectName) {
        this.OwnerProjectName = OwnerProjectName;
    }

    /**
     * Get 项目中文名 
     * @return OwnerProjectIdent 项目中文名
     */
    public String getOwnerProjectIdent() {
        return this.OwnerProjectIdent;
    }

    /**
     * Set 项目中文名
     * @param OwnerProjectIdent 项目中文名
     */
    public void setOwnerProjectIdent(String OwnerProjectIdent) {
        this.OwnerProjectIdent = OwnerProjectIdent;
    }

    /**
     * Get cos bucket 
     * @return COSBucket cos bucket
     */
    public String getCOSBucket() {
        return this.COSBucket;
    }

    /**
     * Set cos bucket
     * @param COSBucket cos bucket
     */
    public void setCOSBucket(String COSBucket) {
        this.COSBucket = COSBucket;
    }

    /**
     * Get cos region 
     * @return COSRegion cos region
     */
    public String getCOSRegion() {
        return this.COSRegion;
    }

    /**
     * Set cos region
     * @param COSRegion cos region
     */
    public void setCOSRegion(String COSRegion) {
        this.COSRegion = COSRegion;
    }

    public ModifyDataSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDataSourceRequest(ModifyDataSourceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.BizParams != null) {
            this.BizParams = new String(source.BizParams);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Display != null) {
            this.Display = new String(source.Display);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Collect != null) {
            this.Collect = new String(source.Collect);
        }
        if (source.OwnerProjectId != null) {
            this.OwnerProjectId = new String(source.OwnerProjectId);
        }
        if (source.OwnerProjectName != null) {
            this.OwnerProjectName = new String(source.OwnerProjectName);
        }
        if (source.OwnerProjectIdent != null) {
            this.OwnerProjectIdent = new String(source.OwnerProjectIdent);
        }
        if (source.COSBucket != null) {
            this.COSBucket = new String(source.COSBucket);
        }
        if (source.COSRegion != null) {
            this.COSRegion = new String(source.COSRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "BizParams", this.BizParams);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Display", this.Display);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Collect", this.Collect);
        this.setParamSimple(map, prefix + "OwnerProjectId", this.OwnerProjectId);
        this.setParamSimple(map, prefix + "OwnerProjectName", this.OwnerProjectName);
        this.setParamSimple(map, prefix + "OwnerProjectIdent", this.OwnerProjectIdent);
        this.setParamSimple(map, prefix + "COSBucket", this.COSBucket);
        this.setParamSimple(map, prefix + "COSRegion", this.COSRegion);

    }
}

