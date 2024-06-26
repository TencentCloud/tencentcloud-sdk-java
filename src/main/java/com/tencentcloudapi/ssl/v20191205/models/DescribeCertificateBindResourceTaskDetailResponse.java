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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateBindResourceTaskDetailResponse extends AbstractModel {

    /**
    * 关联clb资源详情	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CLB")
    @Expose
    private ClbInstanceList [] CLB;

    /**
    * 关联cdn资源详情	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CDN")
    @Expose
    private CdnInstanceList [] CDN;

    /**
    * 关联waf资源详情	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WAF")
    @Expose
    private WafInstanceList [] WAF;

    /**
    * 关联ddos资源详情	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDOS")
    @Expose
    private DdosInstanceList [] DDOS;

    /**
    * 关联live资源详情	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LIVE")
    @Expose
    private LiveInstanceList [] LIVE;

    /**
    * 关联vod资源详情	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VOD")
    @Expose
    private VODInstanceList [] VOD;

    /**
    * 关联tke资源详情	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TKE")
    @Expose
    private TkeInstanceList [] TKE;

    /**
    * 关联apigateway资源详情	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("APIGATEWAY")
    @Expose
    private ApiGatewayInstanceList [] APIGATEWAY;

    /**
    * 关联tcb资源详情	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TCB")
    @Expose
    private TCBInstanceList [] TCB;

    /**
    * 关联teo资源详情	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TEO")
    @Expose
    private TeoInstanceList [] TEO;

    /**
    * 关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 当前结果缓存时间
    */
    @SerializedName("CacheTime")
    @Expose
    private String CacheTime;

    /**
    * 关联tse资源详情	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TSE")
    @Expose
    private TSEInstanceList [] TSE;

    /**
    * 关联的COS资源详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("COS")
    @Expose
    private COSInstanceList [] COS;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 关联clb资源详情	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CLB 关联clb资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClbInstanceList [] getCLB() {
        return this.CLB;
    }

    /**
     * Set 关联clb资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     * @param CLB 关联clb资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCLB(ClbInstanceList [] CLB) {
        this.CLB = CLB;
    }

    /**
     * Get 关联cdn资源详情	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CDN 关联cdn资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CdnInstanceList [] getCDN() {
        return this.CDN;
    }

    /**
     * Set 关联cdn资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     * @param CDN 关联cdn资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCDN(CdnInstanceList [] CDN) {
        this.CDN = CDN;
    }

    /**
     * Get 关联waf资源详情	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WAF 关联waf资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WafInstanceList [] getWAF() {
        return this.WAF;
    }

    /**
     * Set 关联waf资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     * @param WAF 关联waf资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWAF(WafInstanceList [] WAF) {
        this.WAF = WAF;
    }

    /**
     * Get 关联ddos资源详情	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDOS 关联ddos资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DdosInstanceList [] getDDOS() {
        return this.DDOS;
    }

    /**
     * Set 关联ddos资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDOS 关联ddos资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDOS(DdosInstanceList [] DDOS) {
        this.DDOS = DDOS;
    }

    /**
     * Get 关联live资源详情	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LIVE 关联live资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveInstanceList [] getLIVE() {
        return this.LIVE;
    }

    /**
     * Set 关联live资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     * @param LIVE 关联live资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLIVE(LiveInstanceList [] LIVE) {
        this.LIVE = LIVE;
    }

    /**
     * Get 关联vod资源详情	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VOD 关联vod资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VODInstanceList [] getVOD() {
        return this.VOD;
    }

    /**
     * Set 关联vod资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     * @param VOD 关联vod资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVOD(VODInstanceList [] VOD) {
        this.VOD = VOD;
    }

    /**
     * Get 关联tke资源详情	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TKE 关联tke资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TkeInstanceList [] getTKE() {
        return this.TKE;
    }

    /**
     * Set 关联tke资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     * @param TKE 关联tke资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTKE(TkeInstanceList [] TKE) {
        this.TKE = TKE;
    }

    /**
     * Get 关联apigateway资源详情	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return APIGATEWAY 关联apigateway资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiGatewayInstanceList [] getAPIGATEWAY() {
        return this.APIGATEWAY;
    }

    /**
     * Set 关联apigateway资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     * @param APIGATEWAY 关联apigateway资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAPIGATEWAY(ApiGatewayInstanceList [] APIGATEWAY) {
        this.APIGATEWAY = APIGATEWAY;
    }

    /**
     * Get 关联tcb资源详情	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TCB 关联tcb资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TCBInstanceList [] getTCB() {
        return this.TCB;
    }

    /**
     * Set 关联tcb资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     * @param TCB 关联tcb资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTCB(TCBInstanceList [] TCB) {
        this.TCB = TCB;
    }

    /**
     * Get 关联teo资源详情	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TEO 关联teo资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TeoInstanceList [] getTEO() {
        return this.TEO;
    }

    /**
     * Set 关联teo资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     * @param TEO 关联teo资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTEO(TeoInstanceList [] TEO) {
        this.TEO = TEO;
    }

    /**
     * Get 关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因 
     * @return Status 关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因
     * @param Status 关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 当前结果缓存时间 
     * @return CacheTime 当前结果缓存时间
     */
    public String getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set 当前结果缓存时间
     * @param CacheTime 当前结果缓存时间
     */
    public void setCacheTime(String CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Get 关联tse资源详情	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TSE 关联tse资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TSEInstanceList [] getTSE() {
        return this.TSE;
    }

    /**
     * Set 关联tse资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     * @param TSE 关联tse资源详情	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTSE(TSEInstanceList [] TSE) {
        this.TSE = TSE;
    }

    /**
     * Get 关联的COS资源详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return COS 关联的COS资源详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public COSInstanceList [] getCOS() {
        return this.COS;
    }

    /**
     * Set 关联的COS资源详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param COS 关联的COS资源详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCOS(COSInstanceList [] COS) {
        this.COS = COS;
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

    public DescribeCertificateBindResourceTaskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateBindResourceTaskDetailResponse(DescribeCertificateBindResourceTaskDetailResponse source) {
        if (source.CLB != null) {
            this.CLB = new ClbInstanceList[source.CLB.length];
            for (int i = 0; i < source.CLB.length; i++) {
                this.CLB[i] = new ClbInstanceList(source.CLB[i]);
            }
        }
        if (source.CDN != null) {
            this.CDN = new CdnInstanceList[source.CDN.length];
            for (int i = 0; i < source.CDN.length; i++) {
                this.CDN[i] = new CdnInstanceList(source.CDN[i]);
            }
        }
        if (source.WAF != null) {
            this.WAF = new WafInstanceList[source.WAF.length];
            for (int i = 0; i < source.WAF.length; i++) {
                this.WAF[i] = new WafInstanceList(source.WAF[i]);
            }
        }
        if (source.DDOS != null) {
            this.DDOS = new DdosInstanceList[source.DDOS.length];
            for (int i = 0; i < source.DDOS.length; i++) {
                this.DDOS[i] = new DdosInstanceList(source.DDOS[i]);
            }
        }
        if (source.LIVE != null) {
            this.LIVE = new LiveInstanceList[source.LIVE.length];
            for (int i = 0; i < source.LIVE.length; i++) {
                this.LIVE[i] = new LiveInstanceList(source.LIVE[i]);
            }
        }
        if (source.VOD != null) {
            this.VOD = new VODInstanceList[source.VOD.length];
            for (int i = 0; i < source.VOD.length; i++) {
                this.VOD[i] = new VODInstanceList(source.VOD[i]);
            }
        }
        if (source.TKE != null) {
            this.TKE = new TkeInstanceList[source.TKE.length];
            for (int i = 0; i < source.TKE.length; i++) {
                this.TKE[i] = new TkeInstanceList(source.TKE[i]);
            }
        }
        if (source.APIGATEWAY != null) {
            this.APIGATEWAY = new ApiGatewayInstanceList[source.APIGATEWAY.length];
            for (int i = 0; i < source.APIGATEWAY.length; i++) {
                this.APIGATEWAY[i] = new ApiGatewayInstanceList(source.APIGATEWAY[i]);
            }
        }
        if (source.TCB != null) {
            this.TCB = new TCBInstanceList[source.TCB.length];
            for (int i = 0; i < source.TCB.length; i++) {
                this.TCB[i] = new TCBInstanceList(source.TCB[i]);
            }
        }
        if (source.TEO != null) {
            this.TEO = new TeoInstanceList[source.TEO.length];
            for (int i = 0; i < source.TEO.length; i++) {
                this.TEO[i] = new TeoInstanceList(source.TEO[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CacheTime != null) {
            this.CacheTime = new String(source.CacheTime);
        }
        if (source.TSE != null) {
            this.TSE = new TSEInstanceList[source.TSE.length];
            for (int i = 0; i < source.TSE.length; i++) {
                this.TSE[i] = new TSEInstanceList(source.TSE[i]);
            }
        }
        if (source.COS != null) {
            this.COS = new COSInstanceList[source.COS.length];
            for (int i = 0; i < source.COS.length; i++) {
                this.COS[i] = new COSInstanceList(source.COS[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CLB.", this.CLB);
        this.setParamArrayObj(map, prefix + "CDN.", this.CDN);
        this.setParamArrayObj(map, prefix + "WAF.", this.WAF);
        this.setParamArrayObj(map, prefix + "DDOS.", this.DDOS);
        this.setParamArrayObj(map, prefix + "LIVE.", this.LIVE);
        this.setParamArrayObj(map, prefix + "VOD.", this.VOD);
        this.setParamArrayObj(map, prefix + "TKE.", this.TKE);
        this.setParamArrayObj(map, prefix + "APIGATEWAY.", this.APIGATEWAY);
        this.setParamArrayObj(map, prefix + "TCB.", this.TCB);
        this.setParamArrayObj(map, prefix + "TEO.", this.TEO);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);
        this.setParamArrayObj(map, prefix + "TSE.", this.TSE);
        this.setParamArrayObj(map, prefix + "COS.", this.COS);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

