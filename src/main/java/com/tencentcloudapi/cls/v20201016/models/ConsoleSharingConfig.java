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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsoleSharingConfig extends AbstractModel {

    /**
    * 分享链接名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 仪表盘: 1; 检索页:2
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 分享链接有效期，单位：毫秒，最长支持30天
    */
    @SerializedName("DurationMilliseconds")
    @Expose
    private Long DurationMilliseconds;

    /**
    * 允许访问的资源列表
    */
    @SerializedName("Resources")
    @Expose
    private String [] Resources;

    /**
    * 分享链接域名，可选范围
- 公网匿名分享：填写clsshare.com
- datasight内网匿名分享(若开启)：datasight内网域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 验证码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyCode")
    @Expose
    private String VerifyCode;

    /**
    * 开始时间，支持绝对时间(13位时间戳字符串)/相对时间字符串
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，支持绝对时间(13位时间戳字符串)/相对时间字符串
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 当StartTime/EndTime为相对时间时，基于NowTime计算绝对时间，默认为创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NowTime")
    @Expose
    private Long NowTime;

    /**
    * params参数列表，当Type为2时支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private ConsoleSharingParam [] Params;

    /**
    * 是否允许访问者自行修改检索分析时间范围，默认不锁定
    */
    @SerializedName("IsLockTimeRange")
    @Expose
    private Boolean IsLockTimeRange;

    /**
    * 是否允许访问者自行修改日志检索语句。在检索页分享中表示检索语句锁定状态；在仪表盘中表示过滤变量锁定状态
    */
    @SerializedName("IsLockQuery")
    @Expose
    private Boolean IsLockQuery;

    /**
     * Get 分享链接名称 
     * @return Name 分享链接名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分享链接名称
     * @param Name 分享链接名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 仪表盘: 1; 检索页:2 
     * @return Type 仪表盘: 1; 检索页:2
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 仪表盘: 1; 检索页:2
     * @param Type 仪表盘: 1; 检索页:2
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 分享链接有效期，单位：毫秒，最长支持30天 
     * @return DurationMilliseconds 分享链接有效期，单位：毫秒，最长支持30天
     */
    public Long getDurationMilliseconds() {
        return this.DurationMilliseconds;
    }

    /**
     * Set 分享链接有效期，单位：毫秒，最长支持30天
     * @param DurationMilliseconds 分享链接有效期，单位：毫秒，最长支持30天
     */
    public void setDurationMilliseconds(Long DurationMilliseconds) {
        this.DurationMilliseconds = DurationMilliseconds;
    }

    /**
     * Get 允许访问的资源列表 
     * @return Resources 允许访问的资源列表
     */
    public String [] getResources() {
        return this.Resources;
    }

    /**
     * Set 允许访问的资源列表
     * @param Resources 允许访问的资源列表
     */
    public void setResources(String [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 分享链接域名，可选范围
- 公网匿名分享：填写clsshare.com
- datasight内网匿名分享(若开启)：datasight内网域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 分享链接域名，可选范围
- 公网匿名分享：填写clsshare.com
- datasight内网匿名分享(若开启)：datasight内网域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 分享链接域名，可选范围
- 公网匿名分享：填写clsshare.com
- datasight内网匿名分享(若开启)：datasight内网域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 分享链接域名，可选范围
- 公网匿名分享：填写clsshare.com
- datasight内网匿名分享(若开启)：datasight内网域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 验证码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyCode 验证码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyCode() {
        return this.VerifyCode;
    }

    /**
     * Set 验证码
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyCode 验证码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyCode(String VerifyCode) {
        this.VerifyCode = VerifyCode;
    }

    /**
     * Get 开始时间，支持绝对时间(13位时间戳字符串)/相对时间字符串 
     * @return StartTime 开始时间，支持绝对时间(13位时间戳字符串)/相对时间字符串
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，支持绝对时间(13位时间戳字符串)/相对时间字符串
     * @param StartTime 开始时间，支持绝对时间(13位时间戳字符串)/相对时间字符串
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，支持绝对时间(13位时间戳字符串)/相对时间字符串 
     * @return EndTime 结束时间，支持绝对时间(13位时间戳字符串)/相对时间字符串
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，支持绝对时间(13位时间戳字符串)/相对时间字符串
     * @param EndTime 结束时间，支持绝对时间(13位时间戳字符串)/相对时间字符串
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 当StartTime/EndTime为相对时间时，基于NowTime计算绝对时间，默认为创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NowTime 当StartTime/EndTime为相对时间时，基于NowTime计算绝对时间，默认为创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNowTime() {
        return this.NowTime;
    }

    /**
     * Set 当StartTime/EndTime为相对时间时，基于NowTime计算绝对时间，默认为创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NowTime 当StartTime/EndTime为相对时间时，基于NowTime计算绝对时间，默认为创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNowTime(Long NowTime) {
        this.NowTime = NowTime;
    }

    /**
     * Get params参数列表，当Type为2时支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params params参数列表，当Type为2时支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsoleSharingParam [] getParams() {
        return this.Params;
    }

    /**
     * Set params参数列表，当Type为2时支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params params参数列表，当Type为2时支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(ConsoleSharingParam [] Params) {
        this.Params = Params;
    }

    /**
     * Get 是否允许访问者自行修改检索分析时间范围，默认不锁定 
     * @return IsLockTimeRange 是否允许访问者自行修改检索分析时间范围，默认不锁定
     */
    public Boolean getIsLockTimeRange() {
        return this.IsLockTimeRange;
    }

    /**
     * Set 是否允许访问者自行修改检索分析时间范围，默认不锁定
     * @param IsLockTimeRange 是否允许访问者自行修改检索分析时间范围，默认不锁定
     */
    public void setIsLockTimeRange(Boolean IsLockTimeRange) {
        this.IsLockTimeRange = IsLockTimeRange;
    }

    /**
     * Get 是否允许访问者自行修改日志检索语句。在检索页分享中表示检索语句锁定状态；在仪表盘中表示过滤变量锁定状态 
     * @return IsLockQuery 是否允许访问者自行修改日志检索语句。在检索页分享中表示检索语句锁定状态；在仪表盘中表示过滤变量锁定状态
     */
    public Boolean getIsLockQuery() {
        return this.IsLockQuery;
    }

    /**
     * Set 是否允许访问者自行修改日志检索语句。在检索页分享中表示检索语句锁定状态；在仪表盘中表示过滤变量锁定状态
     * @param IsLockQuery 是否允许访问者自行修改日志检索语句。在检索页分享中表示检索语句锁定状态；在仪表盘中表示过滤变量锁定状态
     */
    public void setIsLockQuery(Boolean IsLockQuery) {
        this.IsLockQuery = IsLockQuery;
    }

    public ConsoleSharingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsoleSharingConfig(ConsoleSharingConfig source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.DurationMilliseconds != null) {
            this.DurationMilliseconds = new Long(source.DurationMilliseconds);
        }
        if (source.Resources != null) {
            this.Resources = new String[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new String(source.Resources[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.VerifyCode != null) {
            this.VerifyCode = new String(source.VerifyCode);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.NowTime != null) {
            this.NowTime = new Long(source.NowTime);
        }
        if (source.Params != null) {
            this.Params = new ConsoleSharingParam[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new ConsoleSharingParam(source.Params[i]);
            }
        }
        if (source.IsLockTimeRange != null) {
            this.IsLockTimeRange = new Boolean(source.IsLockTimeRange);
        }
        if (source.IsLockQuery != null) {
            this.IsLockQuery = new Boolean(source.IsLockQuery);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DurationMilliseconds", this.DurationMilliseconds);
        this.setParamArraySimple(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "VerifyCode", this.VerifyCode);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NowTime", this.NowTime);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamSimple(map, prefix + "IsLockTimeRange", this.IsLockTimeRange);
        this.setParamSimple(map, prefix + "IsLockQuery", this.IsLockQuery);

    }
}

