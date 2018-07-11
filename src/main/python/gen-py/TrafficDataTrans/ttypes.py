#
# Autogenerated by Thrift Compiler (0.10.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TFrozenDict, TException, TApplicationException
from thrift.protocol.TProtocol import TProtocolException
import sys

from thrift.transport import TTransport


class NowAreaTrafficData(object):
    """
    Attributes:
     - areaId
     - timeOfHour
     - nowAreaTraffic
    """

    thrift_spec = (
        None,  # 0
        (1, TType.STRING, 'areaId', 'UTF8', None, ),  # 1
        (2, TType.DOUBLE, 'timeOfHour', None, None, ),  # 2
        (3, TType.LIST, 'nowAreaTraffic', (TType.DOUBLE, None, False), None, ),  # 3
    )

    def __init__(self, areaId=None, timeOfHour=None, nowAreaTraffic=None,):
        self.areaId = areaId
        self.timeOfHour = timeOfHour
        self.nowAreaTraffic = nowAreaTraffic

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.STRING:
                    self.areaId = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.DOUBLE:
                    self.timeOfHour = iprot.readDouble()
                else:
                    iprot.skip(ftype)
            elif fid == 3:
                if ftype == TType.LIST:
                    self.nowAreaTraffic = []
                    (_etype3, _size0) = iprot.readListBegin()
                    for _i4 in range(_size0):
                        _elem5 = iprot.readDouble()
                        self.nowAreaTraffic.append(_elem5)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('NowAreaTrafficData')
        if self.areaId is not None:
            oprot.writeFieldBegin('areaId', TType.STRING, 1)
            oprot.writeString(self.areaId.encode('utf-8') if sys.version_info[0] == 2 else self.areaId)
            oprot.writeFieldEnd()
        if self.timeOfHour is not None:
            oprot.writeFieldBegin('timeOfHour', TType.DOUBLE, 2)
            oprot.writeDouble(self.timeOfHour)
            oprot.writeFieldEnd()
        if self.nowAreaTraffic is not None:
            oprot.writeFieldBegin('nowAreaTraffic', TType.LIST, 3)
            oprot.writeListBegin(TType.DOUBLE, len(self.nowAreaTraffic))
            for iter6 in self.nowAreaTraffic:
                oprot.writeDouble(iter6)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class PredictedAreaTrafficData(object):
    """
    Attributes:
     - migration
     - predictedAreaTraffic
    """

    thrift_spec = (
        None,  # 0
        (1, TType.DOUBLE, 'migration', None, None, ),  # 1
        (2, TType.LIST, 'predictedAreaTraffic', (TType.DOUBLE, None, False), None, ),  # 2
    )

    def __init__(self, migration=None, predictedAreaTraffic=None,):
        self.migration = migration
        self.predictedAreaTraffic = predictedAreaTraffic

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.DOUBLE:
                    self.migration = iprot.readDouble()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.LIST:
                    self.predictedAreaTraffic = []
                    (_etype10, _size7) = iprot.readListBegin()
                    for _i11 in range(_size7):
                        _elem12 = iprot.readDouble()
                        self.predictedAreaTraffic.append(_elem12)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('PredictedAreaTrafficData')
        if self.migration is not None:
            oprot.writeFieldBegin('migration', TType.DOUBLE, 1)
            oprot.writeDouble(self.migration)
            oprot.writeFieldEnd()
        if self.predictedAreaTraffic is not None:
            oprot.writeFieldBegin('predictedAreaTraffic', TType.LIST, 2)
            oprot.writeListBegin(TType.DOUBLE, len(self.predictedAreaTraffic))
            for iter13 in self.predictedAreaTraffic:
                oprot.writeDouble(iter13)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class NowEdgeTrafficData(object):
    """
    Attributes:
     - nodeSequence
     - timeOfHour
     - nowEdgeTraffic
    """

    thrift_spec = (
        None,  # 0
        (1, TType.LIST, 'nodeSequence', (TType.DOUBLE, None, False), None, ),  # 1
        (2, TType.DOUBLE, 'timeOfHour', None, None, ),  # 2
        (3, TType.LIST, 'nowEdgeTraffic', (TType.DOUBLE, None, False), None, ),  # 3
    )

    def __init__(self, nodeSequence=None, timeOfHour=None, nowEdgeTraffic=None,):
        self.nodeSequence = nodeSequence
        self.timeOfHour = timeOfHour
        self.nowEdgeTraffic = nowEdgeTraffic

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.LIST:
                    self.nodeSequence = []
                    (_etype17, _size14) = iprot.readListBegin()
                    for _i18 in range(_size14):
                        _elem19 = iprot.readDouble()
                        self.nodeSequence.append(_elem19)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.DOUBLE:
                    self.timeOfHour = iprot.readDouble()
                else:
                    iprot.skip(ftype)
            elif fid == 3:
                if ftype == TType.LIST:
                    self.nowEdgeTraffic = []
                    (_etype23, _size20) = iprot.readListBegin()
                    for _i24 in range(_size20):
                        _elem25 = iprot.readDouble()
                        self.nowEdgeTraffic.append(_elem25)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('TrafficDescription.NowEdgeTrafficData')
        if self.nodeSequence is not None:
            oprot.writeFieldBegin('nodeSequence', TType.LIST, 1)
            oprot.writeListBegin(TType.DOUBLE, len(self.nodeSequence))
            for iter26 in self.nodeSequence:
                oprot.writeDouble(iter26)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        if self.timeOfHour is not None:
            oprot.writeFieldBegin('timeOfHour', TType.DOUBLE, 2)
            oprot.writeDouble(self.timeOfHour)
            oprot.writeFieldEnd()
        if self.nowEdgeTraffic is not None:
            oprot.writeFieldBegin('nowEdgeTraffic', TType.LIST, 3)
            oprot.writeListBegin(TType.DOUBLE, len(self.nowEdgeTraffic))
            for iter27 in self.nowEdgeTraffic:
                oprot.writeDouble(iter27)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class PredictedEdgeTrafficData(object):
    """
    Attributes:
     - predictedEdgeTraffic
    """

    thrift_spec = (
        None,  # 0
        (1, TType.LIST, 'predictedEdgeTraffic', (TType.DOUBLE, None, False), None, ),  # 1
    )

    def __init__(self, predictedEdgeTraffic=None,):
        self.predictedEdgeTraffic = predictedEdgeTraffic

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.LIST:
                    self.predictedEdgeTraffic = []
                    (_etype31, _size28) = iprot.readListBegin()
                    for _i32 in range(_size28):
                        _elem33 = iprot.readDouble()
                        self.predictedEdgeTraffic.append(_elem33)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('TrafficDescription.PredictedEdgeTrafficData')
        if self.predictedEdgeTraffic is not None:
            oprot.writeFieldBegin('predictedEdgeTraffic', TType.LIST, 1)
            oprot.writeListBegin(TType.DOUBLE, len(self.predictedEdgeTraffic))
            for iter34 in self.predictedEdgeTraffic:
                oprot.writeDouble(iter34)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)
