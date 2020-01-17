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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BruteAttack extends AbstractModel{

    /**
    * 事件ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机IP。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 破解事件状态
<li>BRUTEATTACK_FAIL_ACCOUNT： 暴力破解事件-失败(存在帐号)  </li>
<li>BRUTEATTACK_FAIL_NOACCOUNT：暴力破解事件-失败(帐号不存在)</li>
<li>BRUTEATTACK_SUCCESS：暴力破解事件-成功</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 用户名称。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 城市ID。
    */
    @SerializedName("City")
    @Expose
    private Long City;

    /**
    * 国家ID。
    */
    @SerializedName("Country")
    @Expose
    private Long Country;

    /**
    * 省份ID。
    */
    @SerializedName("Province")
    @Expose
    private Long Province;

    /**
    * 来源IP。
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 尝试破解次数。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 发生时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 主机名称。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 云镜客户端唯一标识UUID。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 是否专业版。
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * 阻断状态。
    */
    @SerializedName("BanStatus")
    @Expose
    private String BanStatus;

    /**
    * 机器UUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get 事件ID。 
     * @return Id 事件ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 事件ID。
     * @param Id 事件ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机IP。 
     * @return MachineIp 主机IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机IP。
     * @param MachineIp 主机IP。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 破解事件状态
<li>BRUTEATTACK_FAIL_ACCOUNT： 暴力破解事件-失败(存在帐号)  </li>
<li>BRUTEATTACK_FAIL_NOACCOUNT：暴力破解事件-失败(帐号不存在)</li>
<li>BRUTEATTACK_SUCCESS：暴力破解事件-成功</li> 
     * @return Status 破解事件状态
<li>BRUTEATTACK_FAIL_ACCOUNT： 暴力破解事件-失败(存在帐号)  </li>
<li>BRUTEATTACK_FAIL_NOACCOUNT：暴力破解事件-失败(帐号不存在)</li>
<li>BRUTEATTACK_SUCCESS：暴力破解事件-成功</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 破解事件状态
<li>BRUTEATTACK_FAIL_ACCOUNT： 暴力破解事件-失败(存在帐号)  </li>
<li>BRUTEATTACK_FAIL_NOACCOUNT：暴力破解事件-失败(帐号不存在)</li>
<li>BRUTEATTACK_SUCCESS：暴力破解事件-成功</li>
     * @param Status 破解事件状态
<li>BRUTEATTACK_FAIL_ACCOUNT： 暴力破解事件-失败(存在帐号)  </li>
<li>BRUTEATTACK_FAIL_NOACCOUNT：暴力破解事件-失败(帐号不存在)</li>
<li>BRUTEATTACK_SUCCESS：暴力破解事件-成功</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 用户名称。 
     * @return UserName 用户名称。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名称。
     * @param UserName 用户名称。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 城市ID。 
     * @return City 城市ID。
     */
    public Long getCity() {
        return this.City;
    }

    /**
     * Set 城市ID。
     * @param City 城市ID。
     */
    public void setCity(Long City) {
        this.City = City;
    }

    /**
     * Get 国家ID。 
     * @return Country 国家ID。
     */
    public Long getCountry() {
        return this.Country;
    }

    /**
     * Set 国家ID。
     * @param Country 国家ID。
     */
    public void setCountry(Long Country) {
        this.Country = Country;
    }

    /**
     * Get 省份ID。 
     * @return Province 省份ID。
     */
    public Long getProvince() {
        return this.Province;
    }

    /**
     * Set 省份ID。
     * @param Province 省份ID。
     */
    public void setProvince(Long Province) {
        this.Province = Province;
    }

    /**
     * Get 来源IP。 
     * @return SrcIp 来源IP。
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 来源IP。
     * @param SrcIp 来源IP。
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 尝试破解次数。 
     * @return Count 尝试破解次数。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 尝试破解次数。
     * @param Count 尝试破解次数。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 发生时间。 
     * @return CreateTime 发生时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 发生时间。
     * @param CreateTime 发生时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 主机名称。 
     * @return MachineName 主机名称。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名称。
     * @param MachineName 主机名称。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 云镜客户端唯一标识UUID。 
     * @return Uuid 云镜客户端唯一标识UUID。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 云镜客户端唯一标识UUID。
     * @param Uuid 云镜客户端唯一标识UUID。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 是否专业版。 
     * @return IsProVersion 是否专业版。
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set 是否专业版。
     * @param IsProVersion 是否专业版。
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get 阻断状态。 
     * @return BanStatus 阻断状态。
     */
    public String getBanStatus() {
        return this.BanStatus;
    }

    /**
     * Set 阻断状态。
     * @param BanStatus 阻断状态。
     */
    public void setBanStatus(String BanStatus) {
        this.BanStatus = BanStatus;
    }

    /**
     * Get 机器UUID 
     * @return Quuid 机器UUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 机器UUID
     * @param Quuid 机器UUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "BanStatus", this.BanStatus);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

