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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDspmStatisticsRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>按照资产类型过滤</p><p>枚举值：</p><ul><li>cdb： cdb</li><li>mariadb： mariadb</li><li>cynosdb： cynosdb</li></ul><p>默认值：默认值为空，即不按照资产类型过滤，返回所有资产信息</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String [] AssetType;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>按照资产类型过滤</p><p>枚举值：</p><ul><li>cdb： cdb</li><li>mariadb： mariadb</li><li>cynosdb： cynosdb</li></ul><p>默认值：默认值为空，即不按照资产类型过滤，返回所有资产信息</p> 
     * @return AssetType <p>按照资产类型过滤</p><p>枚举值：</p><ul><li>cdb： cdb</li><li>mariadb： mariadb</li><li>cynosdb： cynosdb</li></ul><p>默认值：默认值为空，即不按照资产类型过滤，返回所有资产信息</p>
     */
    public String [] getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>按照资产类型过滤</p><p>枚举值：</p><ul><li>cdb： cdb</li><li>mariadb： mariadb</li><li>cynosdb： cynosdb</li></ul><p>默认值：默认值为空，即不按照资产类型过滤，返回所有资产信息</p>
     * @param AssetType <p>按照资产类型过滤</p><p>枚举值：</p><ul><li>cdb： cdb</li><li>mariadb： mariadb</li><li>cynosdb： cynosdb</li></ul><p>默认值：默认值为空，即不按照资产类型过滤，返回所有资产信息</p>
     */
    public void setAssetType(String [] AssetType) {
        this.AssetType = AssetType;
    }

    public DescribeDspmStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmStatisticsRequest(DescribeDspmStatisticsRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AssetType != null) {
            this.AssetType = new String[source.AssetType.length];
            for (int i = 0; i < source.AssetType.length; i++) {
                this.AssetType[i] = new String(source.AssetType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "AssetType.", this.AssetType);

    }
}

