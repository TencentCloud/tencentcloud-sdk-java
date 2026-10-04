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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FetchOption extends AbstractModel {

    /**
    * <p>是否在响应中返回权限列表，默认false</p>
    */
    @SerializedName("FetchPermissions")
    @Expose
    private Boolean FetchPermissions;

    /**
    * <p>是否获取特征表详情，当AssetType为TABLE时有效</p>
    */
    @SerializedName("FetchFeatureTableDetail")
    @Expose
    private Boolean FetchFeatureTableDetail;

    /**
    * <p>按权限过滤，传入权限列表，仅返回当前用户拥有指定权限的实体。例如传入[&quot;SELECT_TABLE&quot;]则仅返回当前用户有SELECT_TABLE权限的实体。只对list接口生效，为空时不进行权限过滤</p>
    */
    @SerializedName("FilterPermissions")
    @Expose
    private String [] FilterPermissions;

    /**
    * <p>是否在响应中返回负责人信息。不传或为true时返回负责人信息（默认返回），显式传false时不返回</p>
    */
    @SerializedName("FetchOwners")
    @Expose
    private Boolean FetchOwners;

    /**
    * <p>是否将用户Uin转换为用户名(userName)。影响范围：Audit中的CreatorName/LastModifierName、MetaOwner中的OwnerName。不传或为true时执行转换（默认转换），显式传false时不转换</p>
    */
    @SerializedName("FetchUserInfo")
    @Expose
    private Boolean FetchUserInfo;

    /**
    * <p>是否返回字段脱敏策略信息，默认不返回，传true则会查询表字段对应的字段脱敏策略信息</p>
    */
    @SerializedName("FetchMask")
    @Expose
    private Boolean FetchMask;

    /**
    * <p>是否返回标签信息，默认不返回。传true时，GetTable/ListTables/GetCatalog/ListCatalogs/GetSchema/ListSchemas/GetView/ListViews/GetFunction/ListFunctions/GetVolume/ListVolumes/GetModel/ListModels等接口会在对应实体中返回标签（Tags）字段</p>
    */
    @SerializedName("FetchTags")
    @Expose
    private Boolean FetchTags;

    /**
    * <p>是否返回字段关联的字典维度信息，默认不传，不返回</p>
    */
    @SerializedName("FetchDimensions")
    @Expose
    private Boolean FetchDimensions;

    /**
     * Get <p>是否在响应中返回权限列表，默认false</p> 
     * @return FetchPermissions <p>是否在响应中返回权限列表，默认false</p>
     */
    public Boolean getFetchPermissions() {
        return this.FetchPermissions;
    }

    /**
     * Set <p>是否在响应中返回权限列表，默认false</p>
     * @param FetchPermissions <p>是否在响应中返回权限列表，默认false</p>
     */
    public void setFetchPermissions(Boolean FetchPermissions) {
        this.FetchPermissions = FetchPermissions;
    }

    /**
     * Get <p>是否获取特征表详情，当AssetType为TABLE时有效</p> 
     * @return FetchFeatureTableDetail <p>是否获取特征表详情，当AssetType为TABLE时有效</p>
     */
    public Boolean getFetchFeatureTableDetail() {
        return this.FetchFeatureTableDetail;
    }

    /**
     * Set <p>是否获取特征表详情，当AssetType为TABLE时有效</p>
     * @param FetchFeatureTableDetail <p>是否获取特征表详情，当AssetType为TABLE时有效</p>
     */
    public void setFetchFeatureTableDetail(Boolean FetchFeatureTableDetail) {
        this.FetchFeatureTableDetail = FetchFeatureTableDetail;
    }

    /**
     * Get <p>按权限过滤，传入权限列表，仅返回当前用户拥有指定权限的实体。例如传入[&quot;SELECT_TABLE&quot;]则仅返回当前用户有SELECT_TABLE权限的实体。只对list接口生效，为空时不进行权限过滤</p> 
     * @return FilterPermissions <p>按权限过滤，传入权限列表，仅返回当前用户拥有指定权限的实体。例如传入[&quot;SELECT_TABLE&quot;]则仅返回当前用户有SELECT_TABLE权限的实体。只对list接口生效，为空时不进行权限过滤</p>
     */
    public String [] getFilterPermissions() {
        return this.FilterPermissions;
    }

    /**
     * Set <p>按权限过滤，传入权限列表，仅返回当前用户拥有指定权限的实体。例如传入[&quot;SELECT_TABLE&quot;]则仅返回当前用户有SELECT_TABLE权限的实体。只对list接口生效，为空时不进行权限过滤</p>
     * @param FilterPermissions <p>按权限过滤，传入权限列表，仅返回当前用户拥有指定权限的实体。例如传入[&quot;SELECT_TABLE&quot;]则仅返回当前用户有SELECT_TABLE权限的实体。只对list接口生效，为空时不进行权限过滤</p>
     */
    public void setFilterPermissions(String [] FilterPermissions) {
        this.FilterPermissions = FilterPermissions;
    }

    /**
     * Get <p>是否在响应中返回负责人信息。不传或为true时返回负责人信息（默认返回），显式传false时不返回</p> 
     * @return FetchOwners <p>是否在响应中返回负责人信息。不传或为true时返回负责人信息（默认返回），显式传false时不返回</p>
     */
    public Boolean getFetchOwners() {
        return this.FetchOwners;
    }

    /**
     * Set <p>是否在响应中返回负责人信息。不传或为true时返回负责人信息（默认返回），显式传false时不返回</p>
     * @param FetchOwners <p>是否在响应中返回负责人信息。不传或为true时返回负责人信息（默认返回），显式传false时不返回</p>
     */
    public void setFetchOwners(Boolean FetchOwners) {
        this.FetchOwners = FetchOwners;
    }

    /**
     * Get <p>是否将用户Uin转换为用户名(userName)。影响范围：Audit中的CreatorName/LastModifierName、MetaOwner中的OwnerName。不传或为true时执行转换（默认转换），显式传false时不转换</p> 
     * @return FetchUserInfo <p>是否将用户Uin转换为用户名(userName)。影响范围：Audit中的CreatorName/LastModifierName、MetaOwner中的OwnerName。不传或为true时执行转换（默认转换），显式传false时不转换</p>
     */
    public Boolean getFetchUserInfo() {
        return this.FetchUserInfo;
    }

    /**
     * Set <p>是否将用户Uin转换为用户名(userName)。影响范围：Audit中的CreatorName/LastModifierName、MetaOwner中的OwnerName。不传或为true时执行转换（默认转换），显式传false时不转换</p>
     * @param FetchUserInfo <p>是否将用户Uin转换为用户名(userName)。影响范围：Audit中的CreatorName/LastModifierName、MetaOwner中的OwnerName。不传或为true时执行转换（默认转换），显式传false时不转换</p>
     */
    public void setFetchUserInfo(Boolean FetchUserInfo) {
        this.FetchUserInfo = FetchUserInfo;
    }

    /**
     * Get <p>是否返回字段脱敏策略信息，默认不返回，传true则会查询表字段对应的字段脱敏策略信息</p> 
     * @return FetchMask <p>是否返回字段脱敏策略信息，默认不返回，传true则会查询表字段对应的字段脱敏策略信息</p>
     */
    public Boolean getFetchMask() {
        return this.FetchMask;
    }

    /**
     * Set <p>是否返回字段脱敏策略信息，默认不返回，传true则会查询表字段对应的字段脱敏策略信息</p>
     * @param FetchMask <p>是否返回字段脱敏策略信息，默认不返回，传true则会查询表字段对应的字段脱敏策略信息</p>
     */
    public void setFetchMask(Boolean FetchMask) {
        this.FetchMask = FetchMask;
    }

    /**
     * Get <p>是否返回标签信息，默认不返回。传true时，GetTable/ListTables/GetCatalog/ListCatalogs/GetSchema/ListSchemas/GetView/ListViews/GetFunction/ListFunctions/GetVolume/ListVolumes/GetModel/ListModels等接口会在对应实体中返回标签（Tags）字段</p> 
     * @return FetchTags <p>是否返回标签信息，默认不返回。传true时，GetTable/ListTables/GetCatalog/ListCatalogs/GetSchema/ListSchemas/GetView/ListViews/GetFunction/ListFunctions/GetVolume/ListVolumes/GetModel/ListModels等接口会在对应实体中返回标签（Tags）字段</p>
     */
    public Boolean getFetchTags() {
        return this.FetchTags;
    }

    /**
     * Set <p>是否返回标签信息，默认不返回。传true时，GetTable/ListTables/GetCatalog/ListCatalogs/GetSchema/ListSchemas/GetView/ListViews/GetFunction/ListFunctions/GetVolume/ListVolumes/GetModel/ListModels等接口会在对应实体中返回标签（Tags）字段</p>
     * @param FetchTags <p>是否返回标签信息，默认不返回。传true时，GetTable/ListTables/GetCatalog/ListCatalogs/GetSchema/ListSchemas/GetView/ListViews/GetFunction/ListFunctions/GetVolume/ListVolumes/GetModel/ListModels等接口会在对应实体中返回标签（Tags）字段</p>
     */
    public void setFetchTags(Boolean FetchTags) {
        this.FetchTags = FetchTags;
    }

    /**
     * Get <p>是否返回字段关联的字典维度信息，默认不传，不返回</p> 
     * @return FetchDimensions <p>是否返回字段关联的字典维度信息，默认不传，不返回</p>
     */
    public Boolean getFetchDimensions() {
        return this.FetchDimensions;
    }

    /**
     * Set <p>是否返回字段关联的字典维度信息，默认不传，不返回</p>
     * @param FetchDimensions <p>是否返回字段关联的字典维度信息，默认不传，不返回</p>
     */
    public void setFetchDimensions(Boolean FetchDimensions) {
        this.FetchDimensions = FetchDimensions;
    }

    public FetchOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FetchOption(FetchOption source) {
        if (source.FetchPermissions != null) {
            this.FetchPermissions = new Boolean(source.FetchPermissions);
        }
        if (source.FetchFeatureTableDetail != null) {
            this.FetchFeatureTableDetail = new Boolean(source.FetchFeatureTableDetail);
        }
        if (source.FilterPermissions != null) {
            this.FilterPermissions = new String[source.FilterPermissions.length];
            for (int i = 0; i < source.FilterPermissions.length; i++) {
                this.FilterPermissions[i] = new String(source.FilterPermissions[i]);
            }
        }
        if (source.FetchOwners != null) {
            this.FetchOwners = new Boolean(source.FetchOwners);
        }
        if (source.FetchUserInfo != null) {
            this.FetchUserInfo = new Boolean(source.FetchUserInfo);
        }
        if (source.FetchMask != null) {
            this.FetchMask = new Boolean(source.FetchMask);
        }
        if (source.FetchTags != null) {
            this.FetchTags = new Boolean(source.FetchTags);
        }
        if (source.FetchDimensions != null) {
            this.FetchDimensions = new Boolean(source.FetchDimensions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FetchPermissions", this.FetchPermissions);
        this.setParamSimple(map, prefix + "FetchFeatureTableDetail", this.FetchFeatureTableDetail);
        this.setParamArraySimple(map, prefix + "FilterPermissions.", this.FilterPermissions);
        this.setParamSimple(map, prefix + "FetchOwners", this.FetchOwners);
        this.setParamSimple(map, prefix + "FetchUserInfo", this.FetchUserInfo);
        this.setParamSimple(map, prefix + "FetchMask", this.FetchMask);
        this.setParamSimple(map, prefix + "FetchTags", this.FetchTags);
        this.setParamSimple(map, prefix + "FetchDimensions", this.FetchDimensions);

    }
}

