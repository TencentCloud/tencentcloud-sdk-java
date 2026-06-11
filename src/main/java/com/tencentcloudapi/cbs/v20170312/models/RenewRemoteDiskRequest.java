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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewRemoteDiskRequest extends AbstractModel {

    /**
    * <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月单副本SSD硬盘的续费时长。 在云硬盘与挂载的实例一起续费的场景下，可以指定参数CurInstanceDeadline，此时单副本SSD硬盘会按对齐到实例续费后的到期时间来续费。</p>
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private RemoteDiskChargePrepaid DiskChargePrepaid;

    /**
    * <p>单副本SSD硬盘ID。</p>
    */
    @SerializedName("RemoteDiskId")
    @Expose
    private String RemoteDiskId;

    /**
     * Get <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月单副本SSD硬盘的续费时长。 在云硬盘与挂载的实例一起续费的场景下，可以指定参数CurInstanceDeadline，此时单副本SSD硬盘会按对齐到实例续费后的到期时间来续费。</p> 
     * @return DiskChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月单副本SSD硬盘的续费时长。 在云硬盘与挂载的实例一起续费的场景下，可以指定参数CurInstanceDeadline，此时单副本SSD硬盘会按对齐到实例续费后的到期时间来续费。</p>
     */
    public RemoteDiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月单副本SSD硬盘的续费时长。 在云硬盘与挂载的实例一起续费的场景下，可以指定参数CurInstanceDeadline，此时单副本SSD硬盘会按对齐到实例续费后的到期时间来续费。</p>
     * @param DiskChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月单副本SSD硬盘的续费时长。 在云硬盘与挂载的实例一起续费的场景下，可以指定参数CurInstanceDeadline，此时单副本SSD硬盘会按对齐到实例续费后的到期时间来续费。</p>
     */
    public void setDiskChargePrepaid(RemoteDiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Get <p>单副本SSD硬盘ID。</p> 
     * @return RemoteDiskId <p>单副本SSD硬盘ID。</p>
     */
    public String getRemoteDiskId() {
        return this.RemoteDiskId;
    }

    /**
     * Set <p>单副本SSD硬盘ID。</p>
     * @param RemoteDiskId <p>单副本SSD硬盘ID。</p>
     */
    public void setRemoteDiskId(String RemoteDiskId) {
        this.RemoteDiskId = RemoteDiskId;
    }

    public RenewRemoteDiskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewRemoteDiskRequest(RenewRemoteDiskRequest source) {
        if (source.DiskChargePrepaid != null) {
            this.DiskChargePrepaid = new RemoteDiskChargePrepaid(source.DiskChargePrepaid);
        }
        if (source.RemoteDiskId != null) {
            this.RemoteDiskId = new String(source.RemoteDiskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "RemoteDiskId", this.RemoteDiskId);

    }
}

