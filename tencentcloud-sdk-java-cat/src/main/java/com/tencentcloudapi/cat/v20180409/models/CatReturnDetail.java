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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CatReturnDetail extends AbstractModel{

    /**
    * 运营商名称
    */
    @SerializedName("IspName")
    @Expose
    private String IspName;

    /**
    * 省份全拼
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 省份中文名称
    */
    @SerializedName("ProvinceName")
    @Expose
    private String ProvinceName;

    /**
    * Map键值
    */
    @SerializedName("MapKey")
    @Expose
    private String MapKey;

    /**
    * 拨测目标的IP
    */
    @SerializedName("ServerIp")
    @Expose
    private String ServerIp;

    /**
    * 拨测失败个数
    */
    @SerializedName("ResultCount")
    @Expose
    private Long ResultCount;

    /**
    * 拨测失败返回码
    */
    @SerializedName("ResultCode")
    @Expose
    private Long ResultCode;

    /**
    * 拨测失败原因描述
    */
    @SerializedName("ErrorReason")
    @Expose
    private String ErrorReason;

    /**
     * Get 运营商名称 
     * @return IspName 运营商名称
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * Set 运营商名称
     * @param IspName 运营商名称
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    /**
     * Get 省份全拼 
     * @return Province 省份全拼
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份全拼
     * @param Province 省份全拼
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 省份中文名称 
     * @return ProvinceName 省份中文名称
     */
    public String getProvinceName() {
        return this.ProvinceName;
    }

    /**
     * Set 省份中文名称
     * @param ProvinceName 省份中文名称
     */
    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    /**
     * Get Map键值 
     * @return MapKey Map键值
     */
    public String getMapKey() {
        return this.MapKey;
    }

    /**
     * Set Map键值
     * @param MapKey Map键值
     */
    public void setMapKey(String MapKey) {
        this.MapKey = MapKey;
    }

    /**
     * Get 拨测目标的IP 
     * @return ServerIp 拨测目标的IP
     */
    public String getServerIp() {
        return this.ServerIp;
    }

    /**
     * Set 拨测目标的IP
     * @param ServerIp 拨测目标的IP
     */
    public void setServerIp(String ServerIp) {
        this.ServerIp = ServerIp;
    }

    /**
     * Get 拨测失败个数 
     * @return ResultCount 拨测失败个数
     */
    public Long getResultCount() {
        return this.ResultCount;
    }

    /**
     * Set 拨测失败个数
     * @param ResultCount 拨测失败个数
     */
    public void setResultCount(Long ResultCount) {
        this.ResultCount = ResultCount;
    }

    /**
     * Get 拨测失败返回码 
     * @return ResultCode 拨测失败返回码
     */
    public Long getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set 拨测失败返回码
     * @param ResultCode 拨测失败返回码
     */
    public void setResultCode(Long ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get 拨测失败原因描述 
     * @return ErrorReason 拨测失败原因描述
     */
    public String getErrorReason() {
        return this.ErrorReason;
    }

    /**
     * Set 拨测失败原因描述
     * @param ErrorReason 拨测失败原因描述
     */
    public void setErrorReason(String ErrorReason) {
        this.ErrorReason = ErrorReason;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IspName", this.IspName);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "ProvinceName", this.ProvinceName);
        this.setParamSimple(map, prefix + "MapKey", this.MapKey);
        this.setParamSimple(map, prefix + "ServerIp", this.ServerIp);
        this.setParamSimple(map, prefix + "ResultCount", this.ResultCount);
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "ErrorReason", this.ErrorReason);

    }
}

