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
package com.tencentcloudapi.rp.v20200224.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryRegisterProtectionResponse extends AbstractModel{

    /**
    * 业务侧错误码，成功时返回 Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeDesc")
    @Expose
    private String CodeDesc;

    /**
    * accountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociateAccount")
    @Expose
    private String AssociateAccount;

    /**
    * 注册时间戳，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegisterTime")
    @Expose
    private String RegisterTime;

    /**
    * 用户 ID 不同的 accountType 对应不同的用户 ID。如果是 QQ，则填入对应的 openid，微信用户则填入对应的 openid/unionid，手机号则填入对应真实用户手机号（如13123456789）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 注册来源的外网 IP。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegisterIp")
    @Expose
    private String RegisterIp;

    /**
    * 0：表示无恶意。
1 - 4：恶意等级由低到高。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 风险类型。
    */
    @SerializedName("RiskType")
    @Expose
    private Long [] RiskType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 业务侧错误码，成功时返回 Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeDesc 业务侧错误码，成功时返回 Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodeDesc() {
        return this.CodeDesc;
    }

    /**
     * Set 业务侧错误码，成功时返回 Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeDesc 业务侧错误码，成功时返回 Success，错误时返回具体业务错误原因。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeDesc(String CodeDesc) {
        this.CodeDesc = CodeDesc;
    }

    /**
     * Get accountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociateAccount accountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssociateAccount() {
        return this.AssociateAccount;
    }

    /**
     * Set accountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociateAccount accountType 是 QQ 或微信开放账号时，用于标识 QQ 或微信用户登录后关联业务自身的账号 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociateAccount(String AssociateAccount) {
        this.AssociateAccount = AssociateAccount;
    }

    /**
     * Get 注册时间戳，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegisterTime 注册时间戳，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegisterTime() {
        return this.RegisterTime;
    }

    /**
     * Set 注册时间戳，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegisterTime 注册时间戳，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegisterTime(String RegisterTime) {
        this.RegisterTime = RegisterTime;
    }

    /**
     * Get 用户 ID 不同的 accountType 对应不同的用户 ID。如果是 QQ，则填入对应的 openid，微信用户则填入对应的 openid/unionid，手机号则填入对应真实用户手机号（如13123456789）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uid 用户 ID 不同的 accountType 对应不同的用户 ID。如果是 QQ，则填入对应的 openid，微信用户则填入对应的 openid/unionid，手机号则填入对应真实用户手机号（如13123456789）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 用户 ID 不同的 accountType 对应不同的用户 ID。如果是 QQ，则填入对应的 openid，微信用户则填入对应的 openid/unionid，手机号则填入对应真实用户手机号（如13123456789）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uid 用户 ID 不同的 accountType 对应不同的用户 ID。如果是 QQ，则填入对应的 openid，微信用户则填入对应的 openid/unionid，手机号则填入对应真实用户手机号（如13123456789）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 注册来源的外网 IP。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegisterIp 注册来源的外网 IP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegisterIp() {
        return this.RegisterIp;
    }

    /**
     * Set 注册来源的外网 IP。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegisterIp 注册来源的外网 IP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegisterIp(String RegisterIp) {
        this.RegisterIp = RegisterIp;
    }

    /**
     * Get 0：表示无恶意。
1 - 4：恶意等级由低到高。 
     * @return Level 0：表示无恶意。
1 - 4：恶意等级由低到高。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 0：表示无恶意。
1 - 4：恶意等级由低到高。
     * @param Level 0：表示无恶意。
1 - 4：恶意等级由低到高。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 风险类型。 
     * @return RiskType 风险类型。
     */
    public Long [] getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型。
     * @param RiskType 风险类型。
     */
    public void setRiskType(Long [] RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CodeDesc", this.CodeDesc);
        this.setParamSimple(map, prefix + "AssociateAccount", this.AssociateAccount);
        this.setParamSimple(map, prefix + "RegisterTime", this.RegisterTime);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "RegisterIp", this.RegisterIp);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArraySimple(map, prefix + "RiskType.", this.RiskType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

