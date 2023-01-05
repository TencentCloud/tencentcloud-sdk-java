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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tactic extends AbstractModel{

    /**
    * 策略ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 是否自动执行策略
    */
    @SerializedName("IsAuto")
    @Expose
    private Long IsAuto;

    /**
    * 设备上报信息间隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PingInterval")
    @Expose
    private Long PingInterval;

    /**
    * 是否开启弱信号检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsWeak")
    @Expose
    private Long IsWeak;

    /**
    * 弱信号阈值（-dbm）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeakThreshold")
    @Expose
    private Long WeakThreshold;

    /**
    * 忘了时延切换
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDelay")
    @Expose
    private Long IsDelay;

    /**
    * 时延阈值（ms）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayThreshold")
    @Expose
    private Long DelayThreshold;

    /**
    * 是否开启假信号检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsFake")
    @Expose
    private Long IsFake;

    /**
    * 假信号检测IP字符串，用逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FakeIP")
    @Expose
    private String FakeIP;

    /**
    * 假信号检测间隔（s）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FakeInterval")
    @Expose
    private Long FakeInterval;

    /**
    * 是否开启网络制式检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNet")
    @Expose
    private Long IsNet;

    /**
    * 网络回落制式 1: 2G、 2: 3G 、 3: 2/3G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Network")
    @Expose
    private Long Network;

    /**
    * 是否开启移动检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsMove")
    @Expose
    private Long IsMove;

    /**
    * 策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否开启最优先运营商
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPriorityTele")
    @Expose
    private Long IsPriorityTele;

    /**
    * 最优先运营商 1 移动、 2 联通、 3 电信 4 上次在线运营商
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PriorityTele")
    @Expose
    private Long PriorityTele;

    /**
    * 是否开启最不优先运营商
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsBottomTele")
    @Expose
    private Long IsBottomTele;

    /**
    * 最不优先运营商 1 移动、 2 联通、 3 电信
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BottomTele")
    @Expose
    private Long BottomTele;

    /**
    * 是否开启最优先信号选取策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsBestSignal")
    @Expose
    private Long IsBestSignal;

    /**
     * Get 策略ID 
     * @return ID 策略ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 策略ID
     * @param ID 策略ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 是否自动执行策略 
     * @return IsAuto 是否自动执行策略
     */
    public Long getIsAuto() {
        return this.IsAuto;
    }

    /**
     * Set 是否自动执行策略
     * @param IsAuto 是否自动执行策略
     */
    public void setIsAuto(Long IsAuto) {
        this.IsAuto = IsAuto;
    }

    /**
     * Get 设备上报信息间隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PingInterval 设备上报信息间隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPingInterval() {
        return this.PingInterval;
    }

    /**
     * Set 设备上报信息间隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param PingInterval 设备上报信息间隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPingInterval(Long PingInterval) {
        this.PingInterval = PingInterval;
    }

    /**
     * Get 是否开启弱信号检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsWeak 是否开启弱信号检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsWeak() {
        return this.IsWeak;
    }

    /**
     * Set 是否开启弱信号检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsWeak 是否开启弱信号检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsWeak(Long IsWeak) {
        this.IsWeak = IsWeak;
    }

    /**
     * Get 弱信号阈值（-dbm）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeakThreshold 弱信号阈值（-dbm）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeakThreshold() {
        return this.WeakThreshold;
    }

    /**
     * Set 弱信号阈值（-dbm）
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeakThreshold 弱信号阈值（-dbm）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeakThreshold(Long WeakThreshold) {
        this.WeakThreshold = WeakThreshold;
    }

    /**
     * Get 忘了时延切换
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDelay 忘了时延切换
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDelay() {
        return this.IsDelay;
    }

    /**
     * Set 忘了时延切换
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDelay 忘了时延切换
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDelay(Long IsDelay) {
        this.IsDelay = IsDelay;
    }

    /**
     * Get 时延阈值（ms）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayThreshold 时延阈值（ms）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelayThreshold() {
        return this.DelayThreshold;
    }

    /**
     * Set 时延阈值（ms）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayThreshold 时延阈值（ms）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayThreshold(Long DelayThreshold) {
        this.DelayThreshold = DelayThreshold;
    }

    /**
     * Get 是否开启假信号检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsFake 是否开启假信号检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsFake() {
        return this.IsFake;
    }

    /**
     * Set 是否开启假信号检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsFake 是否开启假信号检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsFake(Long IsFake) {
        this.IsFake = IsFake;
    }

    /**
     * Get 假信号检测IP字符串，用逗号分隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FakeIP 假信号检测IP字符串，用逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFakeIP() {
        return this.FakeIP;
    }

    /**
     * Set 假信号检测IP字符串，用逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param FakeIP 假信号检测IP字符串，用逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFakeIP(String FakeIP) {
        this.FakeIP = FakeIP;
    }

    /**
     * Get 假信号检测间隔（s）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FakeInterval 假信号检测间隔（s）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFakeInterval() {
        return this.FakeInterval;
    }

    /**
     * Set 假信号检测间隔（s）
注意：此字段可能返回 null，表示取不到有效值。
     * @param FakeInterval 假信号检测间隔（s）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFakeInterval(Long FakeInterval) {
        this.FakeInterval = FakeInterval;
    }

    /**
     * Get 是否开启网络制式检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNet 是否开启网络制式检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsNet() {
        return this.IsNet;
    }

    /**
     * Set 是否开启网络制式检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNet 是否开启网络制式检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNet(Long IsNet) {
        this.IsNet = IsNet;
    }

    /**
     * Get 网络回落制式 1: 2G、 2: 3G 、 3: 2/3G
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Network 网络回落制式 1: 2G、 2: 3G 、 3: 2/3G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetwork() {
        return this.Network;
    }

    /**
     * Set 网络回落制式 1: 2G、 2: 3G 、 3: 2/3G
注意：此字段可能返回 null，表示取不到有效值。
     * @param Network 网络回落制式 1: 2G、 2: 3G 、 3: 2/3G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetwork(Long Network) {
        this.Network = Network;
    }

    /**
     * Get 是否开启移动检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsMove 是否开启移动检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsMove() {
        return this.IsMove;
    }

    /**
     * Set 是否开启移动检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsMove 是否开启移动检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsMove(Long IsMove) {
        this.IsMove = IsMove;
    }

    /**
     * Get 策略名称 
     * @return Name 策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名称
     * @param Name 策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否开启最优先运营商
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPriorityTele 是否开启最优先运营商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsPriorityTele() {
        return this.IsPriorityTele;
    }

    /**
     * Set 是否开启最优先运营商
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPriorityTele 是否开启最优先运营商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPriorityTele(Long IsPriorityTele) {
        this.IsPriorityTele = IsPriorityTele;
    }

    /**
     * Get 最优先运营商 1 移动、 2 联通、 3 电信 4 上次在线运营商
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PriorityTele 最优先运营商 1 移动、 2 联通、 3 电信 4 上次在线运营商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriorityTele() {
        return this.PriorityTele;
    }

    /**
     * Set 最优先运营商 1 移动、 2 联通、 3 电信 4 上次在线运营商
注意：此字段可能返回 null，表示取不到有效值。
     * @param PriorityTele 最优先运营商 1 移动、 2 联通、 3 电信 4 上次在线运营商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriorityTele(Long PriorityTele) {
        this.PriorityTele = PriorityTele;
    }

    /**
     * Get 是否开启最不优先运营商
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsBottomTele 是否开启最不优先运营商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsBottomTele() {
        return this.IsBottomTele;
    }

    /**
     * Set 是否开启最不优先运营商
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsBottomTele 是否开启最不优先运营商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsBottomTele(Long IsBottomTele) {
        this.IsBottomTele = IsBottomTele;
    }

    /**
     * Get 最不优先运营商 1 移动、 2 联通、 3 电信
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BottomTele 最不优先运营商 1 移动、 2 联通、 3 电信
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBottomTele() {
        return this.BottomTele;
    }

    /**
     * Set 最不优先运营商 1 移动、 2 联通、 3 电信
注意：此字段可能返回 null，表示取不到有效值。
     * @param BottomTele 最不优先运营商 1 移动、 2 联通、 3 电信
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBottomTele(Long BottomTele) {
        this.BottomTele = BottomTele;
    }

    /**
     * Get 是否开启最优先信号选取策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsBestSignal 是否开启最优先信号选取策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsBestSignal() {
        return this.IsBestSignal;
    }

    /**
     * Set 是否开启最优先信号选取策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsBestSignal 是否开启最优先信号选取策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsBestSignal(Long IsBestSignal) {
        this.IsBestSignal = IsBestSignal;
    }

    public Tactic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tactic(Tactic source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.IsAuto != null) {
            this.IsAuto = new Long(source.IsAuto);
        }
        if (source.PingInterval != null) {
            this.PingInterval = new Long(source.PingInterval);
        }
        if (source.IsWeak != null) {
            this.IsWeak = new Long(source.IsWeak);
        }
        if (source.WeakThreshold != null) {
            this.WeakThreshold = new Long(source.WeakThreshold);
        }
        if (source.IsDelay != null) {
            this.IsDelay = new Long(source.IsDelay);
        }
        if (source.DelayThreshold != null) {
            this.DelayThreshold = new Long(source.DelayThreshold);
        }
        if (source.IsFake != null) {
            this.IsFake = new Long(source.IsFake);
        }
        if (source.FakeIP != null) {
            this.FakeIP = new String(source.FakeIP);
        }
        if (source.FakeInterval != null) {
            this.FakeInterval = new Long(source.FakeInterval);
        }
        if (source.IsNet != null) {
            this.IsNet = new Long(source.IsNet);
        }
        if (source.Network != null) {
            this.Network = new Long(source.Network);
        }
        if (source.IsMove != null) {
            this.IsMove = new Long(source.IsMove);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IsPriorityTele != null) {
            this.IsPriorityTele = new Long(source.IsPriorityTele);
        }
        if (source.PriorityTele != null) {
            this.PriorityTele = new Long(source.PriorityTele);
        }
        if (source.IsBottomTele != null) {
            this.IsBottomTele = new Long(source.IsBottomTele);
        }
        if (source.BottomTele != null) {
            this.BottomTele = new Long(source.BottomTele);
        }
        if (source.IsBestSignal != null) {
            this.IsBestSignal = new Long(source.IsBestSignal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "IsAuto", this.IsAuto);
        this.setParamSimple(map, prefix + "PingInterval", this.PingInterval);
        this.setParamSimple(map, prefix + "IsWeak", this.IsWeak);
        this.setParamSimple(map, prefix + "WeakThreshold", this.WeakThreshold);
        this.setParamSimple(map, prefix + "IsDelay", this.IsDelay);
        this.setParamSimple(map, prefix + "DelayThreshold", this.DelayThreshold);
        this.setParamSimple(map, prefix + "IsFake", this.IsFake);
        this.setParamSimple(map, prefix + "FakeIP", this.FakeIP);
        this.setParamSimple(map, prefix + "FakeInterval", this.FakeInterval);
        this.setParamSimple(map, prefix + "IsNet", this.IsNet);
        this.setParamSimple(map, prefix + "Network", this.Network);
        this.setParamSimple(map, prefix + "IsMove", this.IsMove);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsPriorityTele", this.IsPriorityTele);
        this.setParamSimple(map, prefix + "PriorityTele", this.PriorityTele);
        this.setParamSimple(map, prefix + "IsBottomTele", this.IsBottomTele);
        this.setParamSimple(map, prefix + "BottomTele", this.BottomTele);
        this.setParamSimple(map, prefix + "IsBestSignal", this.IsBestSignal);

    }
}

