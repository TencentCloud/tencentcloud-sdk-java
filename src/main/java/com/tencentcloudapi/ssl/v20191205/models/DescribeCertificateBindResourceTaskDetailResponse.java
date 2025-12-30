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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateBindResourceTaskDetailResponse extends AbstractModel {

    /**
    * <p>关联clb资源详情   </p>
    */
    @SerializedName("CLB")
    @Expose
    private ClbInstanceList [] CLB;

    /**
    * <p>关联cdn资源详情   </p>
    */
    @SerializedName("CDN")
    @Expose
    private CdnInstanceList [] CDN;

    /**
    * <p>关联waf资源详情   </p>
    */
    @SerializedName("WAF")
    @Expose
    private WafInstanceList [] WAF;

    /**
    * <p>关联ddos资源详情  </p>
    */
    @SerializedName("DDOS")
    @Expose
    private DdosInstanceList [] DDOS;

    /**
    * <p>关联live资源详情  </p>
    */
    @SerializedName("LIVE")
    @Expose
    private LiveInstanceList [] LIVE;

    /**
    * <p>关联vod资源详情   </p>
    */
    @SerializedName("VOD")
    @Expose
    private VODInstanceList [] VOD;

    /**
    * <p>关联tke资源详情   </p>
    */
    @SerializedName("TKE")
    @Expose
    private TkeInstanceList [] TKE;

    /**
    * <p>关联apigateway资源详情    </p>
    */
    @SerializedName("APIGATEWAY")
    @Expose
    private ApiGatewayInstanceList [] APIGATEWAY;

    /**
    * <p>关联tcb资源详情   </p>
    */
    @SerializedName("TCB")
    @Expose
    private TCBInstanceList [] TCB;

    /**
    * <p>关联teo资源详情   </p>
    */
    @SerializedName("TEO")
    @Expose
    private TeoInstanceList [] TEO;

    /**
    * <p>关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>当前结果缓存时间</p>
    */
    @SerializedName("CacheTime")
    @Expose
    private String CacheTime;

    /**
    * <p>关联tse资源详情   </p>
    */
    @SerializedName("TSE")
    @Expose
    private TSEInstanceList [] TSE;

    /**
    * <p>关联的COS资源详情</p>
    */
    @SerializedName("COS")
    @Expose
    private COSInstanceList [] COS;

    /**
    * <p>关联的TDMQ - Rabbit资源详情</p>
    */
    @SerializedName("TDMQ")
    @Expose
    private TDMQInstanceList [] TDMQ;

    /**
    * <p>关联的MQTT资源详情</p>
    */
    @SerializedName("MQTT")
    @Expose
    private MQTTInstanceList [] MQTT;

    /**
    * <p>关联的GAAP资源详情</p>
    */
    @SerializedName("GAAP")
    @Expose
    private GAAPInstanceList [] GAAP;

    /**
    * <p>关联的SCF资源详情</p>
    */
    @SerializedName("SCF")
    @Expose
    private SCFInstanceList [] SCF;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>关联clb资源详情   </p> 
     * @return CLB <p>关联clb资源详情   </p>
     */
    public ClbInstanceList [] getCLB() {
        return this.CLB;
    }

    /**
     * Set <p>关联clb资源详情   </p>
     * @param CLB <p>关联clb资源详情   </p>
     */
    public void setCLB(ClbInstanceList [] CLB) {
        this.CLB = CLB;
    }

    /**
     * Get <p>关联cdn资源详情   </p> 
     * @return CDN <p>关联cdn资源详情   </p>
     */
    public CdnInstanceList [] getCDN() {
        return this.CDN;
    }

    /**
     * Set <p>关联cdn资源详情   </p>
     * @param CDN <p>关联cdn资源详情   </p>
     */
    public void setCDN(CdnInstanceList [] CDN) {
        this.CDN = CDN;
    }

    /**
     * Get <p>关联waf资源详情   </p> 
     * @return WAF <p>关联waf资源详情   </p>
     */
    public WafInstanceList [] getWAF() {
        return this.WAF;
    }

    /**
     * Set <p>关联waf资源详情   </p>
     * @param WAF <p>关联waf资源详情   </p>
     */
    public void setWAF(WafInstanceList [] WAF) {
        this.WAF = WAF;
    }

    /**
     * Get <p>关联ddos资源详情  </p> 
     * @return DDOS <p>关联ddos资源详情  </p>
     */
    public DdosInstanceList [] getDDOS() {
        return this.DDOS;
    }

    /**
     * Set <p>关联ddos资源详情  </p>
     * @param DDOS <p>关联ddos资源详情  </p>
     */
    public void setDDOS(DdosInstanceList [] DDOS) {
        this.DDOS = DDOS;
    }

    /**
     * Get <p>关联live资源详情  </p> 
     * @return LIVE <p>关联live资源详情  </p>
     */
    public LiveInstanceList [] getLIVE() {
        return this.LIVE;
    }

    /**
     * Set <p>关联live资源详情  </p>
     * @param LIVE <p>关联live资源详情  </p>
     */
    public void setLIVE(LiveInstanceList [] LIVE) {
        this.LIVE = LIVE;
    }

    /**
     * Get <p>关联vod资源详情   </p> 
     * @return VOD <p>关联vod资源详情   </p>
     */
    public VODInstanceList [] getVOD() {
        return this.VOD;
    }

    /**
     * Set <p>关联vod资源详情   </p>
     * @param VOD <p>关联vod资源详情   </p>
     */
    public void setVOD(VODInstanceList [] VOD) {
        this.VOD = VOD;
    }

    /**
     * Get <p>关联tke资源详情   </p> 
     * @return TKE <p>关联tke资源详情   </p>
     */
    public TkeInstanceList [] getTKE() {
        return this.TKE;
    }

    /**
     * Set <p>关联tke资源详情   </p>
     * @param TKE <p>关联tke资源详情   </p>
     */
    public void setTKE(TkeInstanceList [] TKE) {
        this.TKE = TKE;
    }

    /**
     * Get <p>关联apigateway资源详情    </p> 
     * @return APIGATEWAY <p>关联apigateway资源详情    </p>
     */
    public ApiGatewayInstanceList [] getAPIGATEWAY() {
        return this.APIGATEWAY;
    }

    /**
     * Set <p>关联apigateway资源详情    </p>
     * @param APIGATEWAY <p>关联apigateway资源详情    </p>
     */
    public void setAPIGATEWAY(ApiGatewayInstanceList [] APIGATEWAY) {
        this.APIGATEWAY = APIGATEWAY;
    }

    /**
     * Get <p>关联tcb资源详情   </p> 
     * @return TCB <p>关联tcb资源详情   </p>
     */
    public TCBInstanceList [] getTCB() {
        return this.TCB;
    }

    /**
     * Set <p>关联tcb资源详情   </p>
     * @param TCB <p>关联tcb资源详情   </p>
     */
    public void setTCB(TCBInstanceList [] TCB) {
        this.TCB = TCB;
    }

    /**
     * Get <p>关联teo资源详情   </p> 
     * @return TEO <p>关联teo资源详情   </p>
     */
    public TeoInstanceList [] getTEO() {
        return this.TEO;
    }

    /**
     * Set <p>关联teo资源详情   </p>
     * @param TEO <p>关联teo资源详情   </p>
     */
    public void setTEO(TeoInstanceList [] TEO) {
        this.TEO = TEO;
    }

    /**
     * Get <p>关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因</p> 
     * @return Status <p>关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因</p>
     * @param Status <p>关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>当前结果缓存时间</p> 
     * @return CacheTime <p>当前结果缓存时间</p>
     */
    public String getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set <p>当前结果缓存时间</p>
     * @param CacheTime <p>当前结果缓存时间</p>
     */
    public void setCacheTime(String CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Get <p>关联tse资源详情   </p> 
     * @return TSE <p>关联tse资源详情   </p>
     */
    public TSEInstanceList [] getTSE() {
        return this.TSE;
    }

    /**
     * Set <p>关联tse资源详情   </p>
     * @param TSE <p>关联tse资源详情   </p>
     */
    public void setTSE(TSEInstanceList [] TSE) {
        this.TSE = TSE;
    }

    /**
     * Get <p>关联的COS资源详情</p> 
     * @return COS <p>关联的COS资源详情</p>
     */
    public COSInstanceList [] getCOS() {
        return this.COS;
    }

    /**
     * Set <p>关联的COS资源详情</p>
     * @param COS <p>关联的COS资源详情</p>
     */
    public void setCOS(COSInstanceList [] COS) {
        this.COS = COS;
    }

    /**
     * Get <p>关联的TDMQ - Rabbit资源详情</p> 
     * @return TDMQ <p>关联的TDMQ - Rabbit资源详情</p>
     */
    public TDMQInstanceList [] getTDMQ() {
        return this.TDMQ;
    }

    /**
     * Set <p>关联的TDMQ - Rabbit资源详情</p>
     * @param TDMQ <p>关联的TDMQ - Rabbit资源详情</p>
     */
    public void setTDMQ(TDMQInstanceList [] TDMQ) {
        this.TDMQ = TDMQ;
    }

    /**
     * Get <p>关联的MQTT资源详情</p> 
     * @return MQTT <p>关联的MQTT资源详情</p>
     */
    public MQTTInstanceList [] getMQTT() {
        return this.MQTT;
    }

    /**
     * Set <p>关联的MQTT资源详情</p>
     * @param MQTT <p>关联的MQTT资源详情</p>
     */
    public void setMQTT(MQTTInstanceList [] MQTT) {
        this.MQTT = MQTT;
    }

    /**
     * Get <p>关联的GAAP资源详情</p> 
     * @return GAAP <p>关联的GAAP资源详情</p>
     */
    public GAAPInstanceList [] getGAAP() {
        return this.GAAP;
    }

    /**
     * Set <p>关联的GAAP资源详情</p>
     * @param GAAP <p>关联的GAAP资源详情</p>
     */
    public void setGAAP(GAAPInstanceList [] GAAP) {
        this.GAAP = GAAP;
    }

    /**
     * Get <p>关联的SCF资源详情</p> 
     * @return SCF <p>关联的SCF资源详情</p>
     */
    public SCFInstanceList [] getSCF() {
        return this.SCF;
    }

    /**
     * Set <p>关联的SCF资源详情</p>
     * @param SCF <p>关联的SCF资源详情</p>
     */
    public void setSCF(SCFInstanceList [] SCF) {
        this.SCF = SCF;
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
        if (source.TDMQ != null) {
            this.TDMQ = new TDMQInstanceList[source.TDMQ.length];
            for (int i = 0; i < source.TDMQ.length; i++) {
                this.TDMQ[i] = new TDMQInstanceList(source.TDMQ[i]);
            }
        }
        if (source.MQTT != null) {
            this.MQTT = new MQTTInstanceList[source.MQTT.length];
            for (int i = 0; i < source.MQTT.length; i++) {
                this.MQTT[i] = new MQTTInstanceList(source.MQTT[i]);
            }
        }
        if (source.GAAP != null) {
            this.GAAP = new GAAPInstanceList[source.GAAP.length];
            for (int i = 0; i < source.GAAP.length; i++) {
                this.GAAP[i] = new GAAPInstanceList(source.GAAP[i]);
            }
        }
        if (source.SCF != null) {
            this.SCF = new SCFInstanceList[source.SCF.length];
            for (int i = 0; i < source.SCF.length; i++) {
                this.SCF[i] = new SCFInstanceList(source.SCF[i]);
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
        this.setParamArrayObj(map, prefix + "TDMQ.", this.TDMQ);
        this.setParamArrayObj(map, prefix + "MQTT.", this.MQTT);
        this.setParamArrayObj(map, prefix + "GAAP.", this.GAAP);
        this.setParamArrayObj(map, prefix + "SCF.", this.SCF);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

