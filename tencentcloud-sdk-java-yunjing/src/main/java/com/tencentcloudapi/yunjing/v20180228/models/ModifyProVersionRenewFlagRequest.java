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

public class ModifyProVersionRenewFlagRequest extends AbstractModel{

    /**
    * 自动续费标识。取值范围：
<li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
<li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li>
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 主机唯一ID，对应CVM的uuid、BM的instanceId。
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get 自动续费标识。取值范围：
<li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
<li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li> 
     * @return RenewFlag 自动续费标识。取值范围：
<li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
<li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li>
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识。取值范围：
<li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
<li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li>
     * @param RenewFlag 自动续费标识。取值范围：
<li>NOTIFY_AND_AUTO_RENEW：通知过期且自动续费</li>
<li>NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费</li>
<li>DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费</li>
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 主机唯一ID，对应CVM的uuid、BM的instanceId。 
     * @return Quuid 主机唯一ID，对应CVM的uuid、BM的instanceId。
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机唯一ID，对应CVM的uuid、BM的instanceId。
     * @param Quuid 主机唯一ID，对应CVM的uuid、BM的instanceId。
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

