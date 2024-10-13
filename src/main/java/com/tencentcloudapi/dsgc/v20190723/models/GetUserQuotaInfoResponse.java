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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetUserQuotaInfoResponse extends AbstractModel {

    /**
    * DSPA实例ID。
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 用户购买的DB配额。
    */
    @SerializedName("DbTotalQuota")
    @Expose
    private Long DbTotalQuota;

    /**
    * 用户购买的COS存储量配额。
    */
    @SerializedName("CosTotalQuota")
    @Expose
    private Long CosTotalQuota;

    /**
    * 用户可用的DB配额。
    */
    @SerializedName("DbRemainQuota")
    @Expose
    private Long DbRemainQuota;

    /**
    * 用户可用的COS存储量配额。
    */
    @SerializedName("CosRemainQuota")
    @Expose
    private Float CosRemainQuota;

    /**
    * COS存储量单位，例如TB。
    */
    @SerializedName("CosQuotaUnit")
    @Expose
    private String CosQuotaUnit;

    /**
    * db月解绑次数
    */
    @SerializedName("DBUnbindNum")
    @Expose
    private Long DBUnbindNum;

    /**
    * cos月解绑次数
    */
    @SerializedName("COSUnbindNum")
    @Expose
    private Long COSUnbindNum;

    /**
    * 用户购买的实例配额。
    */
    @SerializedName("InsTotalQuota")
    @Expose
    private Long InsTotalQuota;

    /**
    * 用户可用的实例配额。
    */
    @SerializedName("InsRemainQuota")
    @Expose
    private Long InsRemainQuota;

    /**
    * 用户购买的版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DSPA实例ID。 
     * @return DspaId DSPA实例ID。
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID。
     * @param DspaId DSPA实例ID。
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 用户购买的DB配额。 
     * @return DbTotalQuota 用户购买的DB配额。
     */
    public Long getDbTotalQuota() {
        return this.DbTotalQuota;
    }

    /**
     * Set 用户购买的DB配额。
     * @param DbTotalQuota 用户购买的DB配额。
     */
    public void setDbTotalQuota(Long DbTotalQuota) {
        this.DbTotalQuota = DbTotalQuota;
    }

    /**
     * Get 用户购买的COS存储量配额。 
     * @return CosTotalQuota 用户购买的COS存储量配额。
     */
    public Long getCosTotalQuota() {
        return this.CosTotalQuota;
    }

    /**
     * Set 用户购买的COS存储量配额。
     * @param CosTotalQuota 用户购买的COS存储量配额。
     */
    public void setCosTotalQuota(Long CosTotalQuota) {
        this.CosTotalQuota = CosTotalQuota;
    }

    /**
     * Get 用户可用的DB配额。 
     * @return DbRemainQuota 用户可用的DB配额。
     */
    public Long getDbRemainQuota() {
        return this.DbRemainQuota;
    }

    /**
     * Set 用户可用的DB配额。
     * @param DbRemainQuota 用户可用的DB配额。
     */
    public void setDbRemainQuota(Long DbRemainQuota) {
        this.DbRemainQuota = DbRemainQuota;
    }

    /**
     * Get 用户可用的COS存储量配额。 
     * @return CosRemainQuota 用户可用的COS存储量配额。
     */
    public Float getCosRemainQuota() {
        return this.CosRemainQuota;
    }

    /**
     * Set 用户可用的COS存储量配额。
     * @param CosRemainQuota 用户可用的COS存储量配额。
     */
    public void setCosRemainQuota(Float CosRemainQuota) {
        this.CosRemainQuota = CosRemainQuota;
    }

    /**
     * Get COS存储量单位，例如TB。 
     * @return CosQuotaUnit COS存储量单位，例如TB。
     */
    public String getCosQuotaUnit() {
        return this.CosQuotaUnit;
    }

    /**
     * Set COS存储量单位，例如TB。
     * @param CosQuotaUnit COS存储量单位，例如TB。
     */
    public void setCosQuotaUnit(String CosQuotaUnit) {
        this.CosQuotaUnit = CosQuotaUnit;
    }

    /**
     * Get db月解绑次数 
     * @return DBUnbindNum db月解绑次数
     */
    public Long getDBUnbindNum() {
        return this.DBUnbindNum;
    }

    /**
     * Set db月解绑次数
     * @param DBUnbindNum db月解绑次数
     */
    public void setDBUnbindNum(Long DBUnbindNum) {
        this.DBUnbindNum = DBUnbindNum;
    }

    /**
     * Get cos月解绑次数 
     * @return COSUnbindNum cos月解绑次数
     */
    public Long getCOSUnbindNum() {
        return this.COSUnbindNum;
    }

    /**
     * Set cos月解绑次数
     * @param COSUnbindNum cos月解绑次数
     */
    public void setCOSUnbindNum(Long COSUnbindNum) {
        this.COSUnbindNum = COSUnbindNum;
    }

    /**
     * Get 用户购买的实例配额。 
     * @return InsTotalQuota 用户购买的实例配额。
     */
    public Long getInsTotalQuota() {
        return this.InsTotalQuota;
    }

    /**
     * Set 用户购买的实例配额。
     * @param InsTotalQuota 用户购买的实例配额。
     */
    public void setInsTotalQuota(Long InsTotalQuota) {
        this.InsTotalQuota = InsTotalQuota;
    }

    /**
     * Get 用户可用的实例配额。 
     * @return InsRemainQuota 用户可用的实例配额。
     */
    public Long getInsRemainQuota() {
        return this.InsRemainQuota;
    }

    /**
     * Set 用户可用的实例配额。
     * @param InsRemainQuota 用户可用的实例配额。
     */
    public void setInsRemainQuota(Long InsRemainQuota) {
        this.InsRemainQuota = InsRemainQuota;
    }

    /**
     * Get 用户购买的版本 
     * @return Version 用户购买的版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 用户购买的版本
     * @param Version 用户购买的版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetUserQuotaInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUserQuotaInfoResponse(GetUserQuotaInfoResponse source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.DbTotalQuota != null) {
            this.DbTotalQuota = new Long(source.DbTotalQuota);
        }
        if (source.CosTotalQuota != null) {
            this.CosTotalQuota = new Long(source.CosTotalQuota);
        }
        if (source.DbRemainQuota != null) {
            this.DbRemainQuota = new Long(source.DbRemainQuota);
        }
        if (source.CosRemainQuota != null) {
            this.CosRemainQuota = new Float(source.CosRemainQuota);
        }
        if (source.CosQuotaUnit != null) {
            this.CosQuotaUnit = new String(source.CosQuotaUnit);
        }
        if (source.DBUnbindNum != null) {
            this.DBUnbindNum = new Long(source.DBUnbindNum);
        }
        if (source.COSUnbindNum != null) {
            this.COSUnbindNum = new Long(source.COSUnbindNum);
        }
        if (source.InsTotalQuota != null) {
            this.InsTotalQuota = new Long(source.InsTotalQuota);
        }
        if (source.InsRemainQuota != null) {
            this.InsRemainQuota = new Long(source.InsRemainQuota);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "DbTotalQuota", this.DbTotalQuota);
        this.setParamSimple(map, prefix + "CosTotalQuota", this.CosTotalQuota);
        this.setParamSimple(map, prefix + "DbRemainQuota", this.DbRemainQuota);
        this.setParamSimple(map, prefix + "CosRemainQuota", this.CosRemainQuota);
        this.setParamSimple(map, prefix + "CosQuotaUnit", this.CosQuotaUnit);
        this.setParamSimple(map, prefix + "DBUnbindNum", this.DBUnbindNum);
        this.setParamSimple(map, prefix + "COSUnbindNum", this.COSUnbindNum);
        this.setParamSimple(map, prefix + "InsTotalQuota", this.InsTotalQuota);
        this.setParamSimple(map, prefix + "InsRemainQuota", this.InsRemainQuota);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

