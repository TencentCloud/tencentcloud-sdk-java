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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceDashboard extends AbstractModel{

    /**
    * Vpc实例ID，例如：vpc-f1xjkw1b。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网实例ID，例如：subnet-bthucmmy。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 基础网络互通。
    */
    @SerializedName("Classiclink")
    @Expose
    private Long Classiclink;

    /**
    * 专线网关。
    */
    @SerializedName("Dcg")
    @Expose
    private Long Dcg;

    /**
    * 对等连接。
    */
    @SerializedName("Pcx")
    @Expose
    private Long Pcx;

    /**
    * 当前已使用的IP总数。
    */
    @SerializedName("Ip")
    @Expose
    private Long Ip;

    /**
    * NAT网关。
    */
    @SerializedName("Nat")
    @Expose
    private Long Nat;

    /**
    * VPN网关。
    */
    @SerializedName("Vpngw")
    @Expose
    private Long Vpngw;

    /**
    * 流日志。
    */
    @SerializedName("FlowLog")
    @Expose
    private Long FlowLog;

    /**
    * 网络探测。
    */
    @SerializedName("NetworkDetect")
    @Expose
    private Long NetworkDetect;

    /**
    * 网络ACL。
    */
    @SerializedName("NetworkACL")
    @Expose
    private Long NetworkACL;

    /**
    * 云主机。
    */
    @SerializedName("CVM")
    @Expose
    private Long CVM;

    /**
    * 负载均衡。
    */
    @SerializedName("LB")
    @Expose
    private Long LB;

    /**
    * 关系型数据库。
    */
    @SerializedName("CDB")
    @Expose
    private Long CDB;

    /**
    * 云数据库 TencentDB for Memcached。
    */
    @SerializedName("Cmem")
    @Expose
    private Long Cmem;

    /**
    * 时序数据库。
    */
    @SerializedName("CTSDB")
    @Expose
    private Long CTSDB;

    /**
    * 数据库 TencentDB for MariaDB（TDSQL）。
    */
    @SerializedName("MariaDB")
    @Expose
    private Long MariaDB;

    /**
    * 数据库 TencentDB for SQL Server。
    */
    @SerializedName("SQLServer")
    @Expose
    private Long SQLServer;

    /**
    * 云数据库 TencentDB for PostgreSQL。
    */
    @SerializedName("Postgres")
    @Expose
    private Long Postgres;

    /**
    * 网络附加存储。
    */
    @SerializedName("NAS")
    @Expose
    private Long NAS;

    /**
    * Snova云数据仓库。
    */
    @SerializedName("Greenplumn")
    @Expose
    private Long Greenplumn;

    /**
    * 消息队列 CKAFKA。
    */
    @SerializedName("Ckafka")
    @Expose
    private Long Ckafka;

    /**
    * Grocery。
    */
    @SerializedName("Grocery")
    @Expose
    private Long Grocery;

    /**
    * 数据加密服务。
    */
    @SerializedName("HSM")
    @Expose
    private Long HSM;

    /**
    * 游戏存储 Tcaplus。
    */
    @SerializedName("Tcaplus")
    @Expose
    private Long Tcaplus;

    /**
    * Cnas。
    */
    @SerializedName("Cnas")
    @Expose
    private Long Cnas;

    /**
    * HTAP 数据库 TiDB。
    */
    @SerializedName("TiDB")
    @Expose
    private Long TiDB;

    /**
    * EMR 集群。
    */
    @SerializedName("Emr")
    @Expose
    private Long Emr;

    /**
    * SEAL。
    */
    @SerializedName("SEAL")
    @Expose
    private Long SEAL;

    /**
    * 文件存储 CFS。
    */
    @SerializedName("CFS")
    @Expose
    private Long CFS;

    /**
    * Oracle。
    */
    @SerializedName("Oracle")
    @Expose
    private Long Oracle;

    /**
    * ElasticSearch服务。
    */
    @SerializedName("ElasticSearch")
    @Expose
    private Long ElasticSearch;

    /**
    * 区块链服务。
    */
    @SerializedName("TBaaS")
    @Expose
    private Long TBaaS;

    /**
    * Itop。
    */
    @SerializedName("Itop")
    @Expose
    private Long Itop;

    /**
    * 云数据库审计。
    */
    @SerializedName("DBAudit")
    @Expose
    private Long DBAudit;

    /**
    * 企业级云数据库 CynosDB for Postgres。
    */
    @SerializedName("CynosDBPostgres")
    @Expose
    private Long CynosDBPostgres;

    /**
    * 数据库 TencentDB for Redis。
    */
    @SerializedName("Redis")
    @Expose
    private Long Redis;

    /**
    * 数据库 TencentDB for MongoDB。
    */
    @SerializedName("MongoDB")
    @Expose
    private Long MongoDB;

    /**
    * 分布式数据库 TencentDB for TDSQL。
    */
    @SerializedName("DCDB")
    @Expose
    private Long DCDB;

    /**
    * 企业级云数据库 CynosDB for MySQL。
    */
    @SerializedName("CynosDBMySQL")
    @Expose
    private Long CynosDBMySQL;

    /**
    * 子网。
    */
    @SerializedName("Subnet")
    @Expose
    private Long Subnet;

    /**
    * 路由表。
    */
    @SerializedName("RouteTable")
    @Expose
    private Long RouteTable;

    /**
     * Get Vpc实例ID，例如：vpc-f1xjkw1b。 
     * @return VpcId Vpc实例ID，例如：vpc-f1xjkw1b。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Vpc实例ID，例如：vpc-f1xjkw1b。
     * @param VpcId Vpc实例ID，例如：vpc-f1xjkw1b。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网实例ID，例如：subnet-bthucmmy。 
     * @return SubnetId 子网实例ID，例如：subnet-bthucmmy。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网实例ID，例如：subnet-bthucmmy。
     * @param SubnetId 子网实例ID，例如：subnet-bthucmmy。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 基础网络互通。 
     * @return Classiclink 基础网络互通。
     */
    public Long getClassiclink() {
        return this.Classiclink;
    }

    /**
     * Set 基础网络互通。
     * @param Classiclink 基础网络互通。
     */
    public void setClassiclink(Long Classiclink) {
        this.Classiclink = Classiclink;
    }

    /**
     * Get 专线网关。 
     * @return Dcg 专线网关。
     */
    public Long getDcg() {
        return this.Dcg;
    }

    /**
     * Set 专线网关。
     * @param Dcg 专线网关。
     */
    public void setDcg(Long Dcg) {
        this.Dcg = Dcg;
    }

    /**
     * Get 对等连接。 
     * @return Pcx 对等连接。
     */
    public Long getPcx() {
        return this.Pcx;
    }

    /**
     * Set 对等连接。
     * @param Pcx 对等连接。
     */
    public void setPcx(Long Pcx) {
        this.Pcx = Pcx;
    }

    /**
     * Get 当前已使用的IP总数。 
     * @return Ip 当前已使用的IP总数。
     */
    public Long getIp() {
        return this.Ip;
    }

    /**
     * Set 当前已使用的IP总数。
     * @param Ip 当前已使用的IP总数。
     */
    public void setIp(Long Ip) {
        this.Ip = Ip;
    }

    /**
     * Get NAT网关。 
     * @return Nat NAT网关。
     */
    public Long getNat() {
        return this.Nat;
    }

    /**
     * Set NAT网关。
     * @param Nat NAT网关。
     */
    public void setNat(Long Nat) {
        this.Nat = Nat;
    }

    /**
     * Get VPN网关。 
     * @return Vpngw VPN网关。
     */
    public Long getVpngw() {
        return this.Vpngw;
    }

    /**
     * Set VPN网关。
     * @param Vpngw VPN网关。
     */
    public void setVpngw(Long Vpngw) {
        this.Vpngw = Vpngw;
    }

    /**
     * Get 流日志。 
     * @return FlowLog 流日志。
     */
    public Long getFlowLog() {
        return this.FlowLog;
    }

    /**
     * Set 流日志。
     * @param FlowLog 流日志。
     */
    public void setFlowLog(Long FlowLog) {
        this.FlowLog = FlowLog;
    }

    /**
     * Get 网络探测。 
     * @return NetworkDetect 网络探测。
     */
    public Long getNetworkDetect() {
        return this.NetworkDetect;
    }

    /**
     * Set 网络探测。
     * @param NetworkDetect 网络探测。
     */
    public void setNetworkDetect(Long NetworkDetect) {
        this.NetworkDetect = NetworkDetect;
    }

    /**
     * Get 网络ACL。 
     * @return NetworkACL 网络ACL。
     */
    public Long getNetworkACL() {
        return this.NetworkACL;
    }

    /**
     * Set 网络ACL。
     * @param NetworkACL 网络ACL。
     */
    public void setNetworkACL(Long NetworkACL) {
        this.NetworkACL = NetworkACL;
    }

    /**
     * Get 云主机。 
     * @return CVM 云主机。
     */
    public Long getCVM() {
        return this.CVM;
    }

    /**
     * Set 云主机。
     * @param CVM 云主机。
     */
    public void setCVM(Long CVM) {
        this.CVM = CVM;
    }

    /**
     * Get 负载均衡。 
     * @return LB 负载均衡。
     */
    public Long getLB() {
        return this.LB;
    }

    /**
     * Set 负载均衡。
     * @param LB 负载均衡。
     */
    public void setLB(Long LB) {
        this.LB = LB;
    }

    /**
     * Get 关系型数据库。 
     * @return CDB 关系型数据库。
     */
    public Long getCDB() {
        return this.CDB;
    }

    /**
     * Set 关系型数据库。
     * @param CDB 关系型数据库。
     */
    public void setCDB(Long CDB) {
        this.CDB = CDB;
    }

    /**
     * Get 云数据库 TencentDB for Memcached。 
     * @return Cmem 云数据库 TencentDB for Memcached。
     */
    public Long getCmem() {
        return this.Cmem;
    }

    /**
     * Set 云数据库 TencentDB for Memcached。
     * @param Cmem 云数据库 TencentDB for Memcached。
     */
    public void setCmem(Long Cmem) {
        this.Cmem = Cmem;
    }

    /**
     * Get 时序数据库。 
     * @return CTSDB 时序数据库。
     */
    public Long getCTSDB() {
        return this.CTSDB;
    }

    /**
     * Set 时序数据库。
     * @param CTSDB 时序数据库。
     */
    public void setCTSDB(Long CTSDB) {
        this.CTSDB = CTSDB;
    }

    /**
     * Get 数据库 TencentDB for MariaDB（TDSQL）。 
     * @return MariaDB 数据库 TencentDB for MariaDB（TDSQL）。
     */
    public Long getMariaDB() {
        return this.MariaDB;
    }

    /**
     * Set 数据库 TencentDB for MariaDB（TDSQL）。
     * @param MariaDB 数据库 TencentDB for MariaDB（TDSQL）。
     */
    public void setMariaDB(Long MariaDB) {
        this.MariaDB = MariaDB;
    }

    /**
     * Get 数据库 TencentDB for SQL Server。 
     * @return SQLServer 数据库 TencentDB for SQL Server。
     */
    public Long getSQLServer() {
        return this.SQLServer;
    }

    /**
     * Set 数据库 TencentDB for SQL Server。
     * @param SQLServer 数据库 TencentDB for SQL Server。
     */
    public void setSQLServer(Long SQLServer) {
        this.SQLServer = SQLServer;
    }

    /**
     * Get 云数据库 TencentDB for PostgreSQL。 
     * @return Postgres 云数据库 TencentDB for PostgreSQL。
     */
    public Long getPostgres() {
        return this.Postgres;
    }

    /**
     * Set 云数据库 TencentDB for PostgreSQL。
     * @param Postgres 云数据库 TencentDB for PostgreSQL。
     */
    public void setPostgres(Long Postgres) {
        this.Postgres = Postgres;
    }

    /**
     * Get 网络附加存储。 
     * @return NAS 网络附加存储。
     */
    public Long getNAS() {
        return this.NAS;
    }

    /**
     * Set 网络附加存储。
     * @param NAS 网络附加存储。
     */
    public void setNAS(Long NAS) {
        this.NAS = NAS;
    }

    /**
     * Get Snova云数据仓库。 
     * @return Greenplumn Snova云数据仓库。
     */
    public Long getGreenplumn() {
        return this.Greenplumn;
    }

    /**
     * Set Snova云数据仓库。
     * @param Greenplumn Snova云数据仓库。
     */
    public void setGreenplumn(Long Greenplumn) {
        this.Greenplumn = Greenplumn;
    }

    /**
     * Get 消息队列 CKAFKA。 
     * @return Ckafka 消息队列 CKAFKA。
     */
    public Long getCkafka() {
        return this.Ckafka;
    }

    /**
     * Set 消息队列 CKAFKA。
     * @param Ckafka 消息队列 CKAFKA。
     */
    public void setCkafka(Long Ckafka) {
        this.Ckafka = Ckafka;
    }

    /**
     * Get Grocery。 
     * @return Grocery Grocery。
     */
    public Long getGrocery() {
        return this.Grocery;
    }

    /**
     * Set Grocery。
     * @param Grocery Grocery。
     */
    public void setGrocery(Long Grocery) {
        this.Grocery = Grocery;
    }

    /**
     * Get 数据加密服务。 
     * @return HSM 数据加密服务。
     */
    public Long getHSM() {
        return this.HSM;
    }

    /**
     * Set 数据加密服务。
     * @param HSM 数据加密服务。
     */
    public void setHSM(Long HSM) {
        this.HSM = HSM;
    }

    /**
     * Get 游戏存储 Tcaplus。 
     * @return Tcaplus 游戏存储 Tcaplus。
     */
    public Long getTcaplus() {
        return this.Tcaplus;
    }

    /**
     * Set 游戏存储 Tcaplus。
     * @param Tcaplus 游戏存储 Tcaplus。
     */
    public void setTcaplus(Long Tcaplus) {
        this.Tcaplus = Tcaplus;
    }

    /**
     * Get Cnas。 
     * @return Cnas Cnas。
     */
    public Long getCnas() {
        return this.Cnas;
    }

    /**
     * Set Cnas。
     * @param Cnas Cnas。
     */
    public void setCnas(Long Cnas) {
        this.Cnas = Cnas;
    }

    /**
     * Get HTAP 数据库 TiDB。 
     * @return TiDB HTAP 数据库 TiDB。
     */
    public Long getTiDB() {
        return this.TiDB;
    }

    /**
     * Set HTAP 数据库 TiDB。
     * @param TiDB HTAP 数据库 TiDB。
     */
    public void setTiDB(Long TiDB) {
        this.TiDB = TiDB;
    }

    /**
     * Get EMR 集群。 
     * @return Emr EMR 集群。
     */
    public Long getEmr() {
        return this.Emr;
    }

    /**
     * Set EMR 集群。
     * @param Emr EMR 集群。
     */
    public void setEmr(Long Emr) {
        this.Emr = Emr;
    }

    /**
     * Get SEAL。 
     * @return SEAL SEAL。
     */
    public Long getSEAL() {
        return this.SEAL;
    }

    /**
     * Set SEAL。
     * @param SEAL SEAL。
     */
    public void setSEAL(Long SEAL) {
        this.SEAL = SEAL;
    }

    /**
     * Get 文件存储 CFS。 
     * @return CFS 文件存储 CFS。
     */
    public Long getCFS() {
        return this.CFS;
    }

    /**
     * Set 文件存储 CFS。
     * @param CFS 文件存储 CFS。
     */
    public void setCFS(Long CFS) {
        this.CFS = CFS;
    }

    /**
     * Get Oracle。 
     * @return Oracle Oracle。
     */
    public Long getOracle() {
        return this.Oracle;
    }

    /**
     * Set Oracle。
     * @param Oracle Oracle。
     */
    public void setOracle(Long Oracle) {
        this.Oracle = Oracle;
    }

    /**
     * Get ElasticSearch服务。 
     * @return ElasticSearch ElasticSearch服务。
     */
    public Long getElasticSearch() {
        return this.ElasticSearch;
    }

    /**
     * Set ElasticSearch服务。
     * @param ElasticSearch ElasticSearch服务。
     */
    public void setElasticSearch(Long ElasticSearch) {
        this.ElasticSearch = ElasticSearch;
    }

    /**
     * Get 区块链服务。 
     * @return TBaaS 区块链服务。
     */
    public Long getTBaaS() {
        return this.TBaaS;
    }

    /**
     * Set 区块链服务。
     * @param TBaaS 区块链服务。
     */
    public void setTBaaS(Long TBaaS) {
        this.TBaaS = TBaaS;
    }

    /**
     * Get Itop。 
     * @return Itop Itop。
     */
    public Long getItop() {
        return this.Itop;
    }

    /**
     * Set Itop。
     * @param Itop Itop。
     */
    public void setItop(Long Itop) {
        this.Itop = Itop;
    }

    /**
     * Get 云数据库审计。 
     * @return DBAudit 云数据库审计。
     */
    public Long getDBAudit() {
        return this.DBAudit;
    }

    /**
     * Set 云数据库审计。
     * @param DBAudit 云数据库审计。
     */
    public void setDBAudit(Long DBAudit) {
        this.DBAudit = DBAudit;
    }

    /**
     * Get 企业级云数据库 CynosDB for Postgres。 
     * @return CynosDBPostgres 企业级云数据库 CynosDB for Postgres。
     */
    public Long getCynosDBPostgres() {
        return this.CynosDBPostgres;
    }

    /**
     * Set 企业级云数据库 CynosDB for Postgres。
     * @param CynosDBPostgres 企业级云数据库 CynosDB for Postgres。
     */
    public void setCynosDBPostgres(Long CynosDBPostgres) {
        this.CynosDBPostgres = CynosDBPostgres;
    }

    /**
     * Get 数据库 TencentDB for Redis。 
     * @return Redis 数据库 TencentDB for Redis。
     */
    public Long getRedis() {
        return this.Redis;
    }

    /**
     * Set 数据库 TencentDB for Redis。
     * @param Redis 数据库 TencentDB for Redis。
     */
    public void setRedis(Long Redis) {
        this.Redis = Redis;
    }

    /**
     * Get 数据库 TencentDB for MongoDB。 
     * @return MongoDB 数据库 TencentDB for MongoDB。
     */
    public Long getMongoDB() {
        return this.MongoDB;
    }

    /**
     * Set 数据库 TencentDB for MongoDB。
     * @param MongoDB 数据库 TencentDB for MongoDB。
     */
    public void setMongoDB(Long MongoDB) {
        this.MongoDB = MongoDB;
    }

    /**
     * Get 分布式数据库 TencentDB for TDSQL。 
     * @return DCDB 分布式数据库 TencentDB for TDSQL。
     */
    public Long getDCDB() {
        return this.DCDB;
    }

    /**
     * Set 分布式数据库 TencentDB for TDSQL。
     * @param DCDB 分布式数据库 TencentDB for TDSQL。
     */
    public void setDCDB(Long DCDB) {
        this.DCDB = DCDB;
    }

    /**
     * Get 企业级云数据库 CynosDB for MySQL。 
     * @return CynosDBMySQL 企业级云数据库 CynosDB for MySQL。
     */
    public Long getCynosDBMySQL() {
        return this.CynosDBMySQL;
    }

    /**
     * Set 企业级云数据库 CynosDB for MySQL。
     * @param CynosDBMySQL 企业级云数据库 CynosDB for MySQL。
     */
    public void setCynosDBMySQL(Long CynosDBMySQL) {
        this.CynosDBMySQL = CynosDBMySQL;
    }

    /**
     * Get 子网。 
     * @return Subnet 子网。
     */
    public Long getSubnet() {
        return this.Subnet;
    }

    /**
     * Set 子网。
     * @param Subnet 子网。
     */
    public void setSubnet(Long Subnet) {
        this.Subnet = Subnet;
    }

    /**
     * Get 路由表。 
     * @return RouteTable 路由表。
     */
    public Long getRouteTable() {
        return this.RouteTable;
    }

    /**
     * Set 路由表。
     * @param RouteTable 路由表。
     */
    public void setRouteTable(Long RouteTable) {
        this.RouteTable = RouteTable;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Classiclink", this.Classiclink);
        this.setParamSimple(map, prefix + "Dcg", this.Dcg);
        this.setParamSimple(map, prefix + "Pcx", this.Pcx);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Nat", this.Nat);
        this.setParamSimple(map, prefix + "Vpngw", this.Vpngw);
        this.setParamSimple(map, prefix + "FlowLog", this.FlowLog);
        this.setParamSimple(map, prefix + "NetworkDetect", this.NetworkDetect);
        this.setParamSimple(map, prefix + "NetworkACL", this.NetworkACL);
        this.setParamSimple(map, prefix + "CVM", this.CVM);
        this.setParamSimple(map, prefix + "LB", this.LB);
        this.setParamSimple(map, prefix + "CDB", this.CDB);
        this.setParamSimple(map, prefix + "Cmem", this.Cmem);
        this.setParamSimple(map, prefix + "CTSDB", this.CTSDB);
        this.setParamSimple(map, prefix + "MariaDB", this.MariaDB);
        this.setParamSimple(map, prefix + "SQLServer", this.SQLServer);
        this.setParamSimple(map, prefix + "Postgres", this.Postgres);
        this.setParamSimple(map, prefix + "NAS", this.NAS);
        this.setParamSimple(map, prefix + "Greenplumn", this.Greenplumn);
        this.setParamSimple(map, prefix + "Ckafka", this.Ckafka);
        this.setParamSimple(map, prefix + "Grocery", this.Grocery);
        this.setParamSimple(map, prefix + "HSM", this.HSM);
        this.setParamSimple(map, prefix + "Tcaplus", this.Tcaplus);
        this.setParamSimple(map, prefix + "Cnas", this.Cnas);
        this.setParamSimple(map, prefix + "TiDB", this.TiDB);
        this.setParamSimple(map, prefix + "Emr", this.Emr);
        this.setParamSimple(map, prefix + "SEAL", this.SEAL);
        this.setParamSimple(map, prefix + "CFS", this.CFS);
        this.setParamSimple(map, prefix + "Oracle", this.Oracle);
        this.setParamSimple(map, prefix + "ElasticSearch", this.ElasticSearch);
        this.setParamSimple(map, prefix + "TBaaS", this.TBaaS);
        this.setParamSimple(map, prefix + "Itop", this.Itop);
        this.setParamSimple(map, prefix + "DBAudit", this.DBAudit);
        this.setParamSimple(map, prefix + "CynosDBPostgres", this.CynosDBPostgres);
        this.setParamSimple(map, prefix + "Redis", this.Redis);
        this.setParamSimple(map, prefix + "MongoDB", this.MongoDB);
        this.setParamSimple(map, prefix + "DCDB", this.DCDB);
        this.setParamSimple(map, prefix + "CynosDBMySQL", this.CynosDBMySQL);
        this.setParamSimple(map, prefix + "Subnet", this.Subnet);
        this.setParamSimple(map, prefix + "RouteTable", this.RouteTable);

    }
}

