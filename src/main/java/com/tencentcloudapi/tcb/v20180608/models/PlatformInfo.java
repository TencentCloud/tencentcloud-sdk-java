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

public class PlatformInfo extends AbstractModel {

    /**
    * <p>平台版套餐id</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>套餐别名</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>套餐id</p>
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * <p>计费状态</p><p>枚举值：</p><ul><li>normal： 正常</li><li>isolated： 已隔离</li><li>destroyed： 已销毁</li></ul>
    */
    @SerializedName("BillStatus")
    @Expose
    private String BillStatus;

    /**
    * <p>套餐资源状态</p><p>枚举值：</p><ul><li>0： 可用</li><li>5： 发货中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>资源配置</p>
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * <p>购买时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("BillTime")
    @Expose
    private String BillTime;

    /**
    * <p>套餐过期时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>是否自动续费</p><p>枚举值：</p><ul><li>0： 未设置</li><li>1： 自动续费</li><li>2： 设置为到期不续费</li></ul>
    */
    @SerializedName("IsAutoRenew")
    @Expose
    private Long IsAutoRenew;

    /**
    * <p>资源信息列表</p>
    */
    @SerializedName("Resources")
    @Expose
    private PlatFormResourceInfo [] Resources;

    /**
    * <p>所属地域</p><p>枚举值：</p><ul><li>ap-shanghai： 上海</li><li>ap-singapore： 新加坡</li></ul>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get <p>平台版套餐id</p> 
     * @return PlatformId <p>平台版套餐id</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>平台版套餐id</p>
     * @param PlatformId <p>平台版套餐id</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>套餐别名</p> 
     * @return Alias <p>套餐别名</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>套餐别名</p>
     * @param Alias <p>套餐别名</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>套餐id</p> 
     * @return PackageId <p>套餐id</p>
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set <p>套餐id</p>
     * @param PackageId <p>套餐id</p>
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get <p>计费状态</p><p>枚举值：</p><ul><li>normal： 正常</li><li>isolated： 已隔离</li><li>destroyed： 已销毁</li></ul> 
     * @return BillStatus <p>计费状态</p><p>枚举值：</p><ul><li>normal： 正常</li><li>isolated： 已隔离</li><li>destroyed： 已销毁</li></ul>
     */
    public String getBillStatus() {
        return this.BillStatus;
    }

    /**
     * Set <p>计费状态</p><p>枚举值：</p><ul><li>normal： 正常</li><li>isolated： 已隔离</li><li>destroyed： 已销毁</li></ul>
     * @param BillStatus <p>计费状态</p><p>枚举值：</p><ul><li>normal： 正常</li><li>isolated： 已隔离</li><li>destroyed： 已销毁</li></ul>
     */
    public void setBillStatus(String BillStatus) {
        this.BillStatus = BillStatus;
    }

    /**
     * Get <p>套餐资源状态</p><p>枚举值：</p><ul><li>0： 可用</li><li>5： 发货中</li></ul> 
     * @return Status <p>套餐资源状态</p><p>枚举值：</p><ul><li>0： 可用</li><li>5： 发货中</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>套餐资源状态</p><p>枚举值：</p><ul><li>0： 可用</li><li>5： 发货中</li></ul>
     * @param Status <p>套餐资源状态</p><p>枚举值：</p><ul><li>0： 可用</li><li>5： 发货中</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>资源配置</p> 
     * @return Spec <p>资源配置</p>
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>资源配置</p>
     * @param Spec <p>资源配置</p>
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>购买时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return BillTime <p>购买时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getBillTime() {
        return this.BillTime;
    }

    /**
     * Set <p>购买时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param BillTime <p>购买时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setBillTime(String BillTime) {
        this.BillTime = BillTime;
    }

    /**
     * Get <p>套餐过期时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return ExpireTime <p>套餐过期时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>套餐过期时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param ExpireTime <p>套餐过期时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>是否自动续费</p><p>枚举值：</p><ul><li>0： 未设置</li><li>1： 自动续费</li><li>2： 设置为到期不续费</li></ul> 
     * @return IsAutoRenew <p>是否自动续费</p><p>枚举值：</p><ul><li>0： 未设置</li><li>1： 自动续费</li><li>2： 设置为到期不续费</li></ul>
     */
    public Long getIsAutoRenew() {
        return this.IsAutoRenew;
    }

    /**
     * Set <p>是否自动续费</p><p>枚举值：</p><ul><li>0： 未设置</li><li>1： 自动续费</li><li>2： 设置为到期不续费</li></ul>
     * @param IsAutoRenew <p>是否自动续费</p><p>枚举值：</p><ul><li>0： 未设置</li><li>1： 自动续费</li><li>2： 设置为到期不续费</li></ul>
     */
    public void setIsAutoRenew(Long IsAutoRenew) {
        this.IsAutoRenew = IsAutoRenew;
    }

    /**
     * Get <p>资源信息列表</p> 
     * @return Resources <p>资源信息列表</p>
     */
    public PlatFormResourceInfo [] getResources() {
        return this.Resources;
    }

    /**
     * Set <p>资源信息列表</p>
     * @param Resources <p>资源信息列表</p>
     */
    public void setResources(PlatFormResourceInfo [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get <p>所属地域</p><p>枚举值：</p><ul><li>ap-shanghai： 上海</li><li>ap-singapore： 新加坡</li></ul> 
     * @return Region <p>所属地域</p><p>枚举值：</p><ul><li>ap-shanghai： 上海</li><li>ap-singapore： 新加坡</li></ul>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>所属地域</p><p>枚举值：</p><ul><li>ap-shanghai： 上海</li><li>ap-singapore： 新加坡</li></ul>
     * @param Region <p>所属地域</p><p>枚举值：</p><ul><li>ap-shanghai： 上海</li><li>ap-singapore： 新加坡</li></ul>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public PlatformInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlatformInfo(PlatformInfo source) {
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.BillStatus != null) {
            this.BillStatus = new String(source.BillStatus);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.BillTime != null) {
            this.BillTime = new String(source.BillTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.IsAutoRenew != null) {
            this.IsAutoRenew = new Long(source.IsAutoRenew);
        }
        if (source.Resources != null) {
            this.Resources = new PlatFormResourceInfo[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new PlatFormResourceInfo(source.Resources[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "BillStatus", this.BillStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "BillTime", this.BillTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsAutoRenew", this.IsAutoRenew);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

