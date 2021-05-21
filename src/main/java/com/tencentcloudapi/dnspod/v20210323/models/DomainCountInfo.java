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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainCountInfo extends AbstractModel{

    /**
    * 符合条件的域名数量
    */
    @SerializedName("DomainTotal")
    @Expose
    private Long DomainTotal;

    /**
    * 用户可以查看的所有域名数量
    */
    @SerializedName("AllTotal")
    @Expose
    private Long AllTotal;

    /**
    * 用户账号添加的域名数量
    */
    @SerializedName("MineTotal")
    @Expose
    private Long MineTotal;

    /**
    * 共享给用户的域名数量
    */
    @SerializedName("ShareTotal")
    @Expose
    private Long ShareTotal;

    /**
    * 付费域名数量
    */
    @SerializedName("VipTotal")
    @Expose
    private Long VipTotal;

    /**
    * 暂停的域名数量
    */
    @SerializedName("PauseTotal")
    @Expose
    private Long PauseTotal;

    /**
    * dns设置错误的域名数量
    */
    @SerializedName("ErrorTotal")
    @Expose
    private Long ErrorTotal;

    /**
    * 锁定的域名数量
    */
    @SerializedName("LockTotal")
    @Expose
    private Long LockTotal;

    /**
    * 封禁的域名数量
    */
    @SerializedName("SpamTotal")
    @Expose
    private Long SpamTotal;

    /**
    * 30天内即将到期的域名数量
    */
    @SerializedName("VipExpire")
    @Expose
    private Long VipExpire;

    /**
    * 分享给其它人的域名数量
    */
    @SerializedName("ShareOutTotal")
    @Expose
    private Long ShareOutTotal;

    /**
    * 指定分组内的域名数量
    */
    @SerializedName("GroupTotal")
    @Expose
    private Long GroupTotal;

    /**
     * Get 符合条件的域名数量 
     * @return DomainTotal 符合条件的域名数量
     */
    public Long getDomainTotal() {
        return this.DomainTotal;
    }

    /**
     * Set 符合条件的域名数量
     * @param DomainTotal 符合条件的域名数量
     */
    public void setDomainTotal(Long DomainTotal) {
        this.DomainTotal = DomainTotal;
    }

    /**
     * Get 用户可以查看的所有域名数量 
     * @return AllTotal 用户可以查看的所有域名数量
     */
    public Long getAllTotal() {
        return this.AllTotal;
    }

    /**
     * Set 用户可以查看的所有域名数量
     * @param AllTotal 用户可以查看的所有域名数量
     */
    public void setAllTotal(Long AllTotal) {
        this.AllTotal = AllTotal;
    }

    /**
     * Get 用户账号添加的域名数量 
     * @return MineTotal 用户账号添加的域名数量
     */
    public Long getMineTotal() {
        return this.MineTotal;
    }

    /**
     * Set 用户账号添加的域名数量
     * @param MineTotal 用户账号添加的域名数量
     */
    public void setMineTotal(Long MineTotal) {
        this.MineTotal = MineTotal;
    }

    /**
     * Get 共享给用户的域名数量 
     * @return ShareTotal 共享给用户的域名数量
     */
    public Long getShareTotal() {
        return this.ShareTotal;
    }

    /**
     * Set 共享给用户的域名数量
     * @param ShareTotal 共享给用户的域名数量
     */
    public void setShareTotal(Long ShareTotal) {
        this.ShareTotal = ShareTotal;
    }

    /**
     * Get 付费域名数量 
     * @return VipTotal 付费域名数量
     */
    public Long getVipTotal() {
        return this.VipTotal;
    }

    /**
     * Set 付费域名数量
     * @param VipTotal 付费域名数量
     */
    public void setVipTotal(Long VipTotal) {
        this.VipTotal = VipTotal;
    }

    /**
     * Get 暂停的域名数量 
     * @return PauseTotal 暂停的域名数量
     */
    public Long getPauseTotal() {
        return this.PauseTotal;
    }

    /**
     * Set 暂停的域名数量
     * @param PauseTotal 暂停的域名数量
     */
    public void setPauseTotal(Long PauseTotal) {
        this.PauseTotal = PauseTotal;
    }

    /**
     * Get dns设置错误的域名数量 
     * @return ErrorTotal dns设置错误的域名数量
     */
    public Long getErrorTotal() {
        return this.ErrorTotal;
    }

    /**
     * Set dns设置错误的域名数量
     * @param ErrorTotal dns设置错误的域名数量
     */
    public void setErrorTotal(Long ErrorTotal) {
        this.ErrorTotal = ErrorTotal;
    }

    /**
     * Get 锁定的域名数量 
     * @return LockTotal 锁定的域名数量
     */
    public Long getLockTotal() {
        return this.LockTotal;
    }

    /**
     * Set 锁定的域名数量
     * @param LockTotal 锁定的域名数量
     */
    public void setLockTotal(Long LockTotal) {
        this.LockTotal = LockTotal;
    }

    /**
     * Get 封禁的域名数量 
     * @return SpamTotal 封禁的域名数量
     */
    public Long getSpamTotal() {
        return this.SpamTotal;
    }

    /**
     * Set 封禁的域名数量
     * @param SpamTotal 封禁的域名数量
     */
    public void setSpamTotal(Long SpamTotal) {
        this.SpamTotal = SpamTotal;
    }

    /**
     * Get 30天内即将到期的域名数量 
     * @return VipExpire 30天内即将到期的域名数量
     */
    public Long getVipExpire() {
        return this.VipExpire;
    }

    /**
     * Set 30天内即将到期的域名数量
     * @param VipExpire 30天内即将到期的域名数量
     */
    public void setVipExpire(Long VipExpire) {
        this.VipExpire = VipExpire;
    }

    /**
     * Get 分享给其它人的域名数量 
     * @return ShareOutTotal 分享给其它人的域名数量
     */
    public Long getShareOutTotal() {
        return this.ShareOutTotal;
    }

    /**
     * Set 分享给其它人的域名数量
     * @param ShareOutTotal 分享给其它人的域名数量
     */
    public void setShareOutTotal(Long ShareOutTotal) {
        this.ShareOutTotal = ShareOutTotal;
    }

    /**
     * Get 指定分组内的域名数量 
     * @return GroupTotal 指定分组内的域名数量
     */
    public Long getGroupTotal() {
        return this.GroupTotal;
    }

    /**
     * Set 指定分组内的域名数量
     * @param GroupTotal 指定分组内的域名数量
     */
    public void setGroupTotal(Long GroupTotal) {
        this.GroupTotal = GroupTotal;
    }

    public DomainCountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainCountInfo(DomainCountInfo source) {
        if (source.DomainTotal != null) {
            this.DomainTotal = new Long(source.DomainTotal);
        }
        if (source.AllTotal != null) {
            this.AllTotal = new Long(source.AllTotal);
        }
        if (source.MineTotal != null) {
            this.MineTotal = new Long(source.MineTotal);
        }
        if (source.ShareTotal != null) {
            this.ShareTotal = new Long(source.ShareTotal);
        }
        if (source.VipTotal != null) {
            this.VipTotal = new Long(source.VipTotal);
        }
        if (source.PauseTotal != null) {
            this.PauseTotal = new Long(source.PauseTotal);
        }
        if (source.ErrorTotal != null) {
            this.ErrorTotal = new Long(source.ErrorTotal);
        }
        if (source.LockTotal != null) {
            this.LockTotal = new Long(source.LockTotal);
        }
        if (source.SpamTotal != null) {
            this.SpamTotal = new Long(source.SpamTotal);
        }
        if (source.VipExpire != null) {
            this.VipExpire = new Long(source.VipExpire);
        }
        if (source.ShareOutTotal != null) {
            this.ShareOutTotal = new Long(source.ShareOutTotal);
        }
        if (source.GroupTotal != null) {
            this.GroupTotal = new Long(source.GroupTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainTotal", this.DomainTotal);
        this.setParamSimple(map, prefix + "AllTotal", this.AllTotal);
        this.setParamSimple(map, prefix + "MineTotal", this.MineTotal);
        this.setParamSimple(map, prefix + "ShareTotal", this.ShareTotal);
        this.setParamSimple(map, prefix + "VipTotal", this.VipTotal);
        this.setParamSimple(map, prefix + "PauseTotal", this.PauseTotal);
        this.setParamSimple(map, prefix + "ErrorTotal", this.ErrorTotal);
        this.setParamSimple(map, prefix + "LockTotal", this.LockTotal);
        this.setParamSimple(map, prefix + "SpamTotal", this.SpamTotal);
        this.setParamSimple(map, prefix + "VipExpire", this.VipExpire);
        this.setParamSimple(map, prefix + "ShareOutTotal", this.ShareOutTotal);
        this.setParamSimple(map, prefix + "GroupTotal", this.GroupTotal);

    }
}

