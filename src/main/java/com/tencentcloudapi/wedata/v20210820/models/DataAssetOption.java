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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataAssetOption extends AbstractModel {

    /**
    * 是否拥有权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasPermission")
    @Expose
    private Boolean HasPermission;

    /**
    * 是否已收藏
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasFavorite")
    @Expose
    private Boolean HasFavorite;

    /**
    * 其他的操作类型:
取值：
ProjectIdNull -当前表未设置归属项目；
NotCluster - 非系统源不支持权限申请；
ProjectDisabled - 当前项目已被禁用；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherOperate")
    @Expose
    private String OtherOperate;

    /**
    * 被收藏数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FavoriteCount")
    @Expose
    private Long FavoriteCount;

    /**
    * 是否有修改业务权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasBizPermission")
    @Expose
    private Boolean HasBizPermission;

    /**
    * 是否有修改归属项目权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasProjectPermission")
    @Expose
    private Boolean HasProjectPermission;

    /**
    * 用户无映射账户，请先完成账户映射后再来申请。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorTips")
    @Expose
    private String ErrorTips;

    /**
     * Get 是否拥有权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasPermission 是否拥有权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasPermission() {
        return this.HasPermission;
    }

    /**
     * Set 是否拥有权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasPermission 是否拥有权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasPermission(Boolean HasPermission) {
        this.HasPermission = HasPermission;
    }

    /**
     * Get 是否已收藏
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasFavorite 是否已收藏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasFavorite() {
        return this.HasFavorite;
    }

    /**
     * Set 是否已收藏
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasFavorite 是否已收藏
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasFavorite(Boolean HasFavorite) {
        this.HasFavorite = HasFavorite;
    }

    /**
     * Get 其他的操作类型:
取值：
ProjectIdNull -当前表未设置归属项目；
NotCluster - 非系统源不支持权限申请；
ProjectDisabled - 当前项目已被禁用；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherOperate 其他的操作类型:
取值：
ProjectIdNull -当前表未设置归属项目；
NotCluster - 非系统源不支持权限申请；
ProjectDisabled - 当前项目已被禁用；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOtherOperate() {
        return this.OtherOperate;
    }

    /**
     * Set 其他的操作类型:
取值：
ProjectIdNull -当前表未设置归属项目；
NotCluster - 非系统源不支持权限申请；
ProjectDisabled - 当前项目已被禁用；
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherOperate 其他的操作类型:
取值：
ProjectIdNull -当前表未设置归属项目；
NotCluster - 非系统源不支持权限申请；
ProjectDisabled - 当前项目已被禁用；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherOperate(String OtherOperate) {
        this.OtherOperate = OtherOperate;
    }

    /**
     * Get 被收藏数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FavoriteCount 被收藏数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFavoriteCount() {
        return this.FavoriteCount;
    }

    /**
     * Set 被收藏数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FavoriteCount 被收藏数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFavoriteCount(Long FavoriteCount) {
        this.FavoriteCount = FavoriteCount;
    }

    /**
     * Get 是否有修改业务权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasBizPermission 是否有修改业务权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasBizPermission() {
        return this.HasBizPermission;
    }

    /**
     * Set 是否有修改业务权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasBizPermission 是否有修改业务权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasBizPermission(Boolean HasBizPermission) {
        this.HasBizPermission = HasBizPermission;
    }

    /**
     * Get 是否有修改归属项目权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasProjectPermission 是否有修改归属项目权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasProjectPermission() {
        return this.HasProjectPermission;
    }

    /**
     * Set 是否有修改归属项目权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasProjectPermission 是否有修改归属项目权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasProjectPermission(Boolean HasProjectPermission) {
        this.HasProjectPermission = HasProjectPermission;
    }

    /**
     * Get 用户无映射账户，请先完成账户映射后再来申请。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorTips 用户无映射账户，请先完成账户映射后再来申请。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorTips() {
        return this.ErrorTips;
    }

    /**
     * Set 用户无映射账户，请先完成账户映射后再来申请。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorTips 用户无映射账户，请先完成账户映射后再来申请。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorTips(String ErrorTips) {
        this.ErrorTips = ErrorTips;
    }

    public DataAssetOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataAssetOption(DataAssetOption source) {
        if (source.HasPermission != null) {
            this.HasPermission = new Boolean(source.HasPermission);
        }
        if (source.HasFavorite != null) {
            this.HasFavorite = new Boolean(source.HasFavorite);
        }
        if (source.OtherOperate != null) {
            this.OtherOperate = new String(source.OtherOperate);
        }
        if (source.FavoriteCount != null) {
            this.FavoriteCount = new Long(source.FavoriteCount);
        }
        if (source.HasBizPermission != null) {
            this.HasBizPermission = new Boolean(source.HasBizPermission);
        }
        if (source.HasProjectPermission != null) {
            this.HasProjectPermission = new Boolean(source.HasProjectPermission);
        }
        if (source.ErrorTips != null) {
            this.ErrorTips = new String(source.ErrorTips);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HasPermission", this.HasPermission);
        this.setParamSimple(map, prefix + "HasFavorite", this.HasFavorite);
        this.setParamSimple(map, prefix + "OtherOperate", this.OtherOperate);
        this.setParamSimple(map, prefix + "FavoriteCount", this.FavoriteCount);
        this.setParamSimple(map, prefix + "HasBizPermission", this.HasBizPermission);
        this.setParamSimple(map, prefix + "HasProjectPermission", this.HasProjectPermission);
        this.setParamSimple(map, prefix + "ErrorTips", this.ErrorTips);

    }
}

