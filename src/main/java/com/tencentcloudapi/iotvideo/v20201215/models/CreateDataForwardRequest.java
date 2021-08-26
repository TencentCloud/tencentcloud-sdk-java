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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDataForwardRequest extends AbstractModel{

    /**
    * 产品ID。
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 转发地址。如果有鉴权Token，则需要自行传入，例如 [{\"forward\":{\"api\":\"http://123.207.117.108:1080/sub.php\",\"token\":\"testtoken\"}}]
    */
    @SerializedName("ForwardAddr")
    @Expose
    private String ForwardAddr;

    /**
    * 1-数据信息转发 2-设备上下线状态转发 3-数据信息转发&设备上下线状态转发
    */
    @SerializedName("DataChose")
    @Expose
    private Long DataChose;

    /**
     * Get 产品ID。 
     * @return ProductId 产品ID。
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID。
     * @param ProductId 产品ID。
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 转发地址。如果有鉴权Token，则需要自行传入，例如 [{\"forward\":{\"api\":\"http://123.207.117.108:1080/sub.php\",\"token\":\"testtoken\"}}] 
     * @return ForwardAddr 转发地址。如果有鉴权Token，则需要自行传入，例如 [{\"forward\":{\"api\":\"http://123.207.117.108:1080/sub.php\",\"token\":\"testtoken\"}}]
     */
    public String getForwardAddr() {
        return this.ForwardAddr;
    }

    /**
     * Set 转发地址。如果有鉴权Token，则需要自行传入，例如 [{\"forward\":{\"api\":\"http://123.207.117.108:1080/sub.php\",\"token\":\"testtoken\"}}]
     * @param ForwardAddr 转发地址。如果有鉴权Token，则需要自行传入，例如 [{\"forward\":{\"api\":\"http://123.207.117.108:1080/sub.php\",\"token\":\"testtoken\"}}]
     */
    public void setForwardAddr(String ForwardAddr) {
        this.ForwardAddr = ForwardAddr;
    }

    /**
     * Get 1-数据信息转发 2-设备上下线状态转发 3-数据信息转发&设备上下线状态转发 
     * @return DataChose 1-数据信息转发 2-设备上下线状态转发 3-数据信息转发&设备上下线状态转发
     */
    public Long getDataChose() {
        return this.DataChose;
    }

    /**
     * Set 1-数据信息转发 2-设备上下线状态转发 3-数据信息转发&设备上下线状态转发
     * @param DataChose 1-数据信息转发 2-设备上下线状态转发 3-数据信息转发&设备上下线状态转发
     */
    public void setDataChose(Long DataChose) {
        this.DataChose = DataChose;
    }

    public CreateDataForwardRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDataForwardRequest(CreateDataForwardRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ForwardAddr != null) {
            this.ForwardAddr = new String(source.ForwardAddr);
        }
        if (source.DataChose != null) {
            this.DataChose = new Long(source.DataChose);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ForwardAddr", this.ForwardAddr);
        this.setParamSimple(map, prefix + "DataChose", this.DataChose);

    }
}

