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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputDetectAccountActivityValue extends AbstractModel{

    /**
    * 用户 ID accountType 不同对应不同的用户 ID。如是 QQ 或微信用户则填入对应的 openId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 操作时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostTime")
    @Expose
    private Long PostTime;

    /**
    * 用户操作的真实外网 IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 0：表示不活跃
1 - 4：活跃等级由低到高
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 账号标签：
3，无效账号，送检账号参数无法成功解析，请检查微信openid是否有误 ，QQopenid是否与appidU对应，手机号是否有误。
4，黑名单，该账号在业务侧有过拉黑记录
5，白名单，该账号在业务侧有过加白名单记录

环境标签：
205，非公网有效ip，传进来的IP地址为内网ip地址或者ip保留地址；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long [] Type;

    /**
     * Get 用户 ID accountType 不同对应不同的用户 ID。如是 QQ 或微信用户则填入对应的 openId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uid 用户 ID accountType 不同对应不同的用户 ID。如是 QQ 或微信用户则填入对应的 openId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 用户 ID accountType 不同对应不同的用户 ID。如是 QQ 或微信用户则填入对应的 openId
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uid 用户 ID accountType 不同对应不同的用户 ID。如是 QQ 或微信用户则填入对应的 openId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 操作时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostTime 操作时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPostTime() {
        return this.PostTime;
    }

    /**
     * Set 操作时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostTime 操作时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostTime(Long PostTime) {
        this.PostTime = PostTime;
    }

    /**
     * Get 用户操作的真实外网 IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserIp 用户操作的真实外网 IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户操作的真实外网 IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserIp 用户操作的真实外网 IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 0：表示不活跃
1 - 4：活跃等级由低到高
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 0：表示不活跃
1 - 4：活跃等级由低到高
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 0：表示不活跃
1 - 4：活跃等级由低到高
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 0：表示不活跃
1 - 4：活跃等级由低到高
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 账号标签：
3，无效账号，送检账号参数无法成功解析，请检查微信openid是否有误 ，QQopenid是否与appidU对应，手机号是否有误。
4，黑名单，该账号在业务侧有过拉黑记录
5，白名单，该账号在业务侧有过加白名单记录

环境标签：
205，非公网有效ip，传进来的IP地址为内网ip地址或者ip保留地址；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 账号标签：
3，无效账号，送检账号参数无法成功解析，请检查微信openid是否有误 ，QQopenid是否与appidU对应，手机号是否有误。
4，黑名单，该账号在业务侧有过拉黑记录
5，白名单，该账号在业务侧有过加白名单记录

环境标签：
205，非公网有效ip，传进来的IP地址为内网ip地址或者ip保留地址；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getType() {
        return this.Type;
    }

    /**
     * Set 账号标签：
3，无效账号，送检账号参数无法成功解析，请检查微信openid是否有误 ，QQopenid是否与appidU对应，手机号是否有误。
4，黑名单，该账号在业务侧有过拉黑记录
5，白名单，该账号在业务侧有过加白名单记录

环境标签：
205，非公网有效ip，传进来的IP地址为内网ip地址或者ip保留地址；
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 账号标签：
3，无效账号，送检账号参数无法成功解析，请检查微信openid是否有误 ，QQopenid是否与appidU对应，手机号是否有误。
4，黑名单，该账号在业务侧有过拉黑记录
5，白名单，该账号在业务侧有过加白名单记录

环境标签：
205，非公网有效ip，传进来的IP地址为内网ip地址或者ip保留地址；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long [] Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "PostTime", this.PostTime);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);

    }
}

