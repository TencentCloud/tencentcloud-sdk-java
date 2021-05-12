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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEdgePackTaskRequest extends AbstractModel{

    /**
    * apk 所在的 cos 存储桶, 如 edgepack-xxxxxxxx
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * apk 源文件的存储路径, 如 /apk/xxxx.apk
    */
    @SerializedName("CosUriFrom")
    @Expose
    private String CosUriFrom;

    /**
    * BlockID 的值, WALLE为1903654775(0x71777777)，VasDolly为2282837503(0x881155ff),传0或不传时默认为 WALLE 方案
    */
    @SerializedName("BlockID")
    @Expose
    private Long BlockID;

    /**
    * 拓展之后的 apk 目标存储路径,如 /out/xxxx.apk
    */
    @SerializedName("CosUriTo")
    @Expose
    private String CosUriTo;

    /**
     * Get apk 所在的 cos 存储桶, 如 edgepack-xxxxxxxx 
     * @return CosBucket apk 所在的 cos 存储桶, 如 edgepack-xxxxxxxx
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set apk 所在的 cos 存储桶, 如 edgepack-xxxxxxxx
     * @param CosBucket apk 所在的 cos 存储桶, 如 edgepack-xxxxxxxx
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get apk 源文件的存储路径, 如 /apk/xxxx.apk 
     * @return CosUriFrom apk 源文件的存储路径, 如 /apk/xxxx.apk
     */
    public String getCosUriFrom() {
        return this.CosUriFrom;
    }

    /**
     * Set apk 源文件的存储路径, 如 /apk/xxxx.apk
     * @param CosUriFrom apk 源文件的存储路径, 如 /apk/xxxx.apk
     */
    public void setCosUriFrom(String CosUriFrom) {
        this.CosUriFrom = CosUriFrom;
    }

    /**
     * Get BlockID 的值, WALLE为1903654775(0x71777777)，VasDolly为2282837503(0x881155ff),传0或不传时默认为 WALLE 方案 
     * @return BlockID BlockID 的值, WALLE为1903654775(0x71777777)，VasDolly为2282837503(0x881155ff),传0或不传时默认为 WALLE 方案
     */
    public Long getBlockID() {
        return this.BlockID;
    }

    /**
     * Set BlockID 的值, WALLE为1903654775(0x71777777)，VasDolly为2282837503(0x881155ff),传0或不传时默认为 WALLE 方案
     * @param BlockID BlockID 的值, WALLE为1903654775(0x71777777)，VasDolly为2282837503(0x881155ff),传0或不传时默认为 WALLE 方案
     */
    public void setBlockID(Long BlockID) {
        this.BlockID = BlockID;
    }

    /**
     * Get 拓展之后的 apk 目标存储路径,如 /out/xxxx.apk 
     * @return CosUriTo 拓展之后的 apk 目标存储路径,如 /out/xxxx.apk
     */
    public String getCosUriTo() {
        return this.CosUriTo;
    }

    /**
     * Set 拓展之后的 apk 目标存储路径,如 /out/xxxx.apk
     * @param CosUriTo 拓展之后的 apk 目标存储路径,如 /out/xxxx.apk
     */
    public void setCosUriTo(String CosUriTo) {
        this.CosUriTo = CosUriTo;
    }

    public CreateEdgePackTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEdgePackTaskRequest(CreateEdgePackTaskRequest source) {
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.CosUriFrom != null) {
            this.CosUriFrom = new String(source.CosUriFrom);
        }
        if (source.BlockID != null) {
            this.BlockID = new Long(source.BlockID);
        }
        if (source.CosUriTo != null) {
            this.CosUriTo = new String(source.CosUriTo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosUriFrom", this.CosUriFrom);
        this.setParamSimple(map, prefix + "BlockID", this.BlockID);
        this.setParamSimple(map, prefix + "CosUriTo", this.CosUriTo);

    }
}

